package com.google.controller;

import com.google.user.UserAccountData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/check")
    public String checkSystem()
    {
        return "system running !!";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserAccountData data)
    {
        return "drive access successfully !!"+data.getEmail();
    }

    @GetMapping("/getData")
    public UserAccountData getData()
    {
        UserAccountData data=new UserAccountData();
        data.setFirstName("Anand");
        data.setLastName("Sharma");
        data.setEmail("<EMAIL>");
        data.setPassword("<PASSWORD>");
        data.setCity("Hyderabad");
        data.setPincode("500086");
        return data;
    }
}
