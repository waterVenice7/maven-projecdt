package com.heli.mappperCollection;

import com.heli.maven.User;

import java.util.List;

/**
 * @Author:2019/6/19
 */
public interface NewUserMapper {
    void  insertUser(User user);

    List<User> selectUserAll();
}
