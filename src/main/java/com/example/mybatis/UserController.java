package com.example.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    
    @RequestMapping("/select")
    public List<UserEntity> select(){
        return userMapper.selectAll();
    }
}