package com.heli.service.impl;

import com.heli.mappperCollection.NewUserMapper;
import com.heli.maven.User;
import com.heli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:2019/6/22
 */

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private NewUserMapper newUserMapper;

    @Override
    public void addUser(User user) {
        this.newUserMapper.insertUser(user);

    }
}
