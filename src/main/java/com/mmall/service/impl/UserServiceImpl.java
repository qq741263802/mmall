package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.dao.UserMapper;
import com.mmall.pojo.Order;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import com.mmall.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.soap.SOAPBinding;

/**
 * @author lhm
 * @date 2020/7/3 23:29
 */
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> login(String username, String password) {
        int resultCount=userMapper.checkUsername(username);
        if (resultCount==0)
        {
            return ServerResponse.createByErrorMessage("用户名不存在");

        }
        //md5加密
       String md5Password=MD5Util.MD5EncodeUtf8(password);
        User user=userMapper.selectLogin(username,password);
        if (user==null)
        {
            return ServerResponse.createByErrorMessage("密码错误");


        }
        //设置密码为null
        user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",user);
    }
}
