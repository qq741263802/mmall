package com.mmall.service.impl;


import com.mmall.common.ServerResponse;
import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import com.mmall.util.ExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;


/**
 * @author lhm
 * @date 2020/7/11 0:44
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-datasource.xml"})
public class UserServiceImplTest {
    @Autowired
    //private UserMapper userMapper;
    private IUserService iUserService;

    @Test
    public void login() {


//        int count=  userMapper.checkUsername("admin");
//        System.out.println(count);
//       ServerResponse<User> user = iUserService.login("admin","admin");
//       System.out.println(user.getMsg());
        List<Map<String, String>> mm= ExcelUtil.readExcel("D:\\二郎查鲁班今日商品排行-18284.xls");
        System.out.println(mm);












    }
}