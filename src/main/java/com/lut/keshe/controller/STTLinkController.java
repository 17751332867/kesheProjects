package com.lut.keshe.controller;

import com.lut.keshe.pojo.STTLink;
import com.lut.keshe.service.STTLinkService;
import com.lut.keshe.service.StudentG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2021/7/15.
 */
@Controller
public class STTLinkController {

    @Autowired
    STTLinkService sttLinkService;
    @Autowired
    StudentG studentG;

    @RequestMapping("findAllSTTL")
    public String findAllSTTL(HttpSession session){
        String str = "";
        return str;
    }

    @RequestMapping("selectSTTLinkByID")
    public String selectSTTLByID(HttpSession session,Integer StudentID){
        String str = "";
        return str;
    }

    @RequestMapping("insertSTTL")
    public String insertSTTLink(HttpSession session,int studentID,String timuName ,int teacherID){
        studentG.StudentselectTimu(session,studentID,timuName,teacherID);
        return "StudentSelectTimu";
    }
}
