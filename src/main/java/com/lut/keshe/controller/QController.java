package com.lut.keshe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ASUS on 2021/7/16.
 */
@Controller
public class QController {

    @RequestMapping("updateStudent")
    public String UpdateSrudent(){
        return "StudentUpdateInformation";
    }
}
