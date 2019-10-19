package com.senmu.controller;

import com.senmu.bean.User;
import com.senmu.mappers.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    IUserMapper iUserMapper;

    @RequestMapping("/login")
    public String login() {
        Test();
        return "login";
    }

    public void Test() {

        User nancy = new User(12, "Nancy", 20);

        iUserMapper.insert(nancy);
    }
}
