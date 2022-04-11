package com.example.booksellerapp.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String userName;
    private String password;
    private String name;
    private LocalDateTime createTime;
    private Role role;
}
