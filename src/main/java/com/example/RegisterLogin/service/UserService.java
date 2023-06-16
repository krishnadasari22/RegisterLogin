package com.example.RegisterLogin.service;


import com.example.RegisterLogin.entity.User;

public interface UserService {
    User signup(String username, String password);

    User findByUsername(String username);
}
