package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    @Autowired
    private IUserService iUserService;
    @Test
    public void login() {

        ServerResponse<User> response= iUserService.login("admin","admin");
        System.out.println(response);

        }


}