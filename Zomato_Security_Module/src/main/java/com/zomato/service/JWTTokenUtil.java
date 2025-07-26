package com.zomato.service;

import com.fasterxml.jackson.databind.node.BooleanNode;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTTokenUtil  {

    private final String secret_key="fdjhduiefhbhhijijfsfifjijcninuifhsaodhdoshfhfuhudfh";
    private final long expery_time=3*60*1000;

    //token creation for first time login
    public String createToken(String UserName)
    {
        String token=Jwts.builder()
                         .setSubject(UserName)
                         .setIssuedAt(new Date(System.currentTimeMillis()))
                         .setExpiration(new Date(System.currentTimeMillis()+expery_time))
                         .signWith(SignatureAlgorithm.HS256,secret_key)
                         .compact();
        return token;
    }


    //check the username from token and request http is the same or not
    public String getUserNameFromToken(String token)
    {
         //extract user name from token -> once get the username from token,
        // match it with incoming username in request body

        String tokenUserName=Jwts.parser().setSigningKey(secret_key).parseClaimsJws(token).getBody().getSubject();

        //extrected username from token
        return tokenUserName;
    }


    // check the time of token is expired or not, if not expired, then give the access
    public boolean isExpired(String token)
    {
        Date date=Jwts.parser().setSigningKey(secret_key).parseClaimsJws(token).getBody().getExpiration();

        return date.before(new Date());
    }


    public boolean isvalidateToken(String UserName,String token)
    {
        //get the username from a token.
        String UserNameResponse=getUserNameFromToken(token);
        // get the token is expired or not
        boolean isExpired=isExpired(token);

        //compare and return token is valid or not
        // (if the username of token and requested username is matched and time is not expired, then token is valid otherwise invalid)
        return UserNameResponse.equals(UserName) && !isExpired;
    }
}
