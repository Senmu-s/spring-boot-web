package com.senmu.controller;

import com.senmu.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
public class InputController {

    @RequestMapping(value = "/input", method = RequestMethod.POST)
    public String input(HttpServletRequest httpServletRequest, Map<String, Object> map) {
        System.out.println("kkk" + httpServletRequest.getParameter("name"));

        User user = new User(123, "Nancy", 23);
        map.put("user_1", user);

        return "input";
    }
}
