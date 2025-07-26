package com.zomato.db;

import com.zomato.entity.UserEntity;
import com.zomato.request.Userlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDbOperation {

    @Autowired
    ZomatoJpaRepository repository;


    public String UserRegister(UserEntity entity)
    {
        repository.save(entity);
        return "success";
    }
    public Optional<UserEntity> getUser(int id)
    {
        return repository.findById(id);
    }

    public UserEntity login(Userlogin login) {
        UserEntity response=repository.findByEmailAndPassword(login.getEmail(),login.getPassword());
        return response;
    }

    public UserEntity findById(String id)
    {
       UserEntity response= repository.findByEmail(id);
       return response;
    }
}
