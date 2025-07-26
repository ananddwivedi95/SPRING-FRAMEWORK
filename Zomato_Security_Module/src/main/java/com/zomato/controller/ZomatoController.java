package com.zomato.controller;

import com.zomato.entity.UserEntity;
import com.zomato.request.UserRegisterRequest;
import com.zomato.request.Userlogin;
import com.zomato.service.JWTTokenUtil;
import com.zomato.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ZomatoController {

    @Autowired
    UserService userService;

    @Autowired
    JWTTokenUtil tokenUtil;

    @GetMapping("/check")
    public String check(){
        return "working !!";
    }

    @PostMapping("/register")
    public String userRegister(@RequestBody UserRegisterRequest register)
    {
        return userService.UserRegister(register);
    }

    @PostMapping("/login")
    public String login(@RequestBody Userlogin login)
    {
        // step 1: we have to pass the credentials to the spring security layer
        // step 2: internally spring security layer validate user credentials
        //             internally security layer connets to DB and check user name and Password
        // step 3: if user is valid certified by security ,generate token and attach as part of response
        // step 4: in case credentials is invalid , then we will send a message like invalid credentials
        return userService.login(login);
    }

    @GetMapping("/getUser/{id}")
    public UserEntity getUserRegister(@PathVariable int id)
    {
       Optional<UserEntity> response=userService.getUser(id);
       if(response.isPresent())
       {
           return response.get();
       }
       return null;
    }

    @GetMapping("/token")
    public String getToken()
    {
        return tokenUtil.createToken("abcc@example.com");
    }

    @GetMapping("/validate")
    public boolean validateToken(@RequestHeader String token)
    {
        return tokenUtil.isvalidateToken("abcc@example.com",token);
    }
}
