package com.zomato.security;

import com.zomato.service.JWTTokenUtil;
import com.zomato.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtTokenAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    JWTTokenUtil jwtToken;

    @Autowired
    UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        //verify the token is present or not
        // if token is not present then we will send token required
        //if token presented, validate the token

       String token= request.getHeader("Authorization");
       String userNameFromToken=null;
       if(token==null)
       {
           System.out.println("token not presented");
       }
       else {
          userNameFromToken= this.jwtToken.getUserNameFromToken(token);
       }
       if(userNameFromToken!=null && SecurityContextHolder.getContext()==null)
       {
           // db check username and password is present or not
           UserDetails userDetails= this.userService.loadUserByUsername(userNameFromToken);

           // validate JWT token and time
           this.jwtToken.isvalidateToken(userDetails.getUsername(),userNameFromToken);


           filterChain.doFilter(request,response);
       }

    }
}
