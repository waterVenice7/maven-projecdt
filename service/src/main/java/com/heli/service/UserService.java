package com.heli.service;

import com.heli.maven.User;
import org.springframework.stereotype.Service;

/**
 * @Author:2019/6/22
 */
@Service
public interface UserService {
    void addUser(User user);

}
