package com.example.booksellerapp.repository;

import java.util.Optional;

import com.example.booksellerapp.entity.Role;
import com.example.booksellerapp.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserRepository {
    public User saveUser(User user);
    
    public Optional<User> getUserByUserName(String userName);

    public void changeRole(String userName, Role role);
}
