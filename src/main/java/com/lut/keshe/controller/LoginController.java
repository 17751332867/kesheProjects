package com.lut.keshe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.lut.keshe.service.loginservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2021/7/6.
 */
@Controller
public class LoginController {

    @Autowired
    loginservice loginservice;

    @RequestMapping("Login")
    public String Login(HttpSession session,Integer ID, String passwd){
        String str;
        str=loginservice.login(session,ID,passwd);
        return str;
    }

    @RequestMapping("reg")
    public String register(){
        return "register";
    }
}
