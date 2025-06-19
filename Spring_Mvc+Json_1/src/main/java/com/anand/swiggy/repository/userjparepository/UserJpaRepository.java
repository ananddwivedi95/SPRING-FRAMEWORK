package com.anand.swiggy.repository.userjparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anand.swiggy.repository.entity.UserRegister;

@Repository
public interface UserJpaRepository extends JpaRepository<UserRegister, String> {

}
