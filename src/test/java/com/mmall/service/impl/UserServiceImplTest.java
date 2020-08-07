package com.mmall.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.mmall.common.ServerResponse;
import com.mmall.controller.portal.UserController;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import com.mmall.util.DbUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author lhm
 * @date 2020/7/11 0:44
 */
@Service
public class UserServiceImplTest {
    @Autowired
    private IUserService iUserService;
    @SuppressWarnings("resources")
    @Test
    public void login() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        String[] beanArray = applicationContext.getBeanDefinitionNames();

        for(String s : beanArray) {
            System.out.println(s);
        }

       //ServerResponse<User> user =iUserService.login("admin","admin");

//        DbUtils db =new DbUtils();
//        ArrayList<Map<String,Object>> role=db.find("select * from mmall_role");
//        for (Map<String, Object> map:role)
//        {
//
//            for (String s : map.keySet()) {
//                System.out.print(map.get(s) + "  ");
//            }
//        }








    }
}