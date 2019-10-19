package com.senmu.controller;

import com.senmu.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class SuccessController {
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {

        map.put("name", "Nancy");
        map.put("age", 20);
        map.put("mike",new User(12,"Mike",13));

        map.put("users", Arrays.asList("Lisa","Sarah","Lihua"));
        return "success";
        //classpath:/templates/success.html
    }
}
