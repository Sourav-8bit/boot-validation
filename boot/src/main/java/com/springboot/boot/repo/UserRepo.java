package com.springboot.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springboot.boot.model.User;
 
@Repository
public interface UserRepo extends JpaRepository<User , Long>{

}
