package com.mmall.controller.portal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.login.LoginContext;
import javax.servlet.http.HttpSession;


/**
 * @author lhm
 * @date 2020/6/21 23:50
 */
@Controller
@RequestMapping("/user/")
public class UserController {
             @RequestMapping(value= "login.do",method = RequestMethod.POST )
             @ResponseBody
            public Object login(String username,String password,HttpSession session)
            {
                  return  null;

            }


}
