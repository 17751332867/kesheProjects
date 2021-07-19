package com.lut.keshe.service.impl;

import com.lut.keshe.pojo.*;
import com.lut.keshe.service.StudentService;
import com.lut.keshe.service.TeacherService;
import com.lut.keshe.service.UserService;
import com.lut.keshe.service.loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2021/7/5.
 */
@Service
public class LoginImpl implements loginservice {

    @Autowired
    TeacherService teacherService;
    @Autowired
    StudentService studentService;
    @Autowired
    UserService userService;


    Teacher teacher;
    Student student;

    @Override
    public String login(HttpSession session,int ID, String passwd) {

        Timu timu = new Timu();
        String str="index";
        String loginmsg="";
        if(userService.selectUser(ID,passwd)){
            session.setAttribute("ID",ID);
            teacher = teacherService.selectTeacherByID(ID);
            student = studentService.selectStudentByID(ID);
            if(teacher==null&&student!=null){
                session.setAttribute("Student",student);
                str="StudentLogin";
            }else if(teacher!=null&&student==null){
                session.setAttribute("Teacher",teacher);
                str="TeacherLogin";
            }else if(student==null&&teacher==null){
                str="AdminLogin";
            }
        }else {
            loginmsg="用户名或密码不正确";
        }
        session.setAttribute("StudentSelectTimu",timu);
        session.setAttribute("loginmsg",loginmsg);
        return str;

    }
}
