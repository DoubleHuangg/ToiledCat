package com.example.controller;

import com.example.entity.user.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/2/23 0023.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/getUser")
    public List<User> getUser(){
        return repository.findAll();
    }


}
