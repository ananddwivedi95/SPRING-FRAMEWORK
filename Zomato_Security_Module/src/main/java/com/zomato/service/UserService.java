package com.zomato.service;

import com.zomato.db.UserDbOperation;
import com.zomato.entity.UserEntity;
import com.zomato.request.UserRegisterRequest;
import com.zomato.request.Userlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserDbOperation dbOperation;
    public String UserRegister(UserRegisterRequest register)
    {
        UserEntity entity= new UserEntity();
        entity.setId(register.getId());
        entity.setEmail(register.getEmail());
        entity.setPassword(register.getPassword());
        entity.setContactNumber(register.getContactNumber());

        return dbOperation.UserRegister(entity);
    }

    public Optional<UserEntity> getUser(int id) {
         return dbOperation.getUser(id);
    }

   /* //login mechanism
    public String login(Userlogin login)
    {
       UserEntity response= dbOperation.login(login);
       if(response==null)
       {
           return "user not found";
       }
       else if(response.getEmail().equals(login.getEmail()) &&
               response.getPassword().equals(login.getPassword())) {
           return "login success";
       }
        return "failure";
    }*/

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       UserEntity response=dbOperation.findById(username);
       return Optional.ofNullable(response).orElseThrow(()->new UsernameNotFoundException("user not found"));
    }
}
