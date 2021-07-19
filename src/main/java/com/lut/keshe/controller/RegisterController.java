package com.lut.keshe.controller;

import com.lut.keshe.service.RegisterServier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2021/7/9.
 */
@Controller
public class RegisterController {

    @Autowired
    RegisterServier registerServier;
    @RequestMapping("register")
    public String Register(HttpSession session,Integer ID, String passwd, String repasswd){
         String str = "register";
         str = registerServier.Register(session,ID,passwd,repasswd);
         return str;
    }

}
