package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author lhm
 * @date 2020/7/11 0:44
 */
public class UserServiceImplTest {
    @Autowired
    private IUserService iUserService;
    @Test
    public void login() {

        ServerResponse<User> response=iUserService.login("admin","admin");
        System.out.println(response);


    }
}