package com.zomato.db;

import com.zomato.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZomatoJpaRepository extends JpaRepository <UserEntity,Integer>{

     UserEntity findByEmailAndPassword(String email, String password);

     UserEntity findByEmail(String email);
}
