package com.itheima.controller;

import com.itheima.domain.Users;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("doRegister")
    public String save(Users users) {
        System.out.println("-------------------------------------");
        userService.save(users);
        return "success";
    }

}
