package com.heli.test;

import com.heli.mappperCollection.NewUserMapper;
import com.heli.maven.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * @Author:2019/6/20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class InterationTest {

    @Autowired
    private NewUserMapper newUserMapper;
    @Test
    public void insertUserTest(){
        User user =new User();
        user.setUserage(20);
        user.setUsername("admin");
        this.newUserMapper.insertUser(user);
    }
}
