package com.lut.keshe.service.impl;

import com.lut.keshe.pojo.Teacher;
import com.lut.keshe.service.RegisterServier;
import com.lut.keshe.service.TeacherService;
import com.lut.keshe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2021/7/9.
 */
@Service
public class RegisterServierImpl implements RegisterServier {

    @Autowired
    UserService userService;
    @Autowired
    TeacherService teacherService;
    @Override
    public String Register(HttpSession session,int ID, String passwd, String repasswd) {
        String str="register";
        String msg="";
        if(passwd.equals(repasswd)){
            if(userService.selectUser(ID,passwd)){
                msg="用户已存在";
            }else{
                if(ID/10000000>0){

                    userService.addUser(ID,passwd);
                    session.setAttribute("userID",ID);
                }else {
                    Teacher teacher = teacherService.selectTeacherByID(ID);
                    if(teacher==null){
                        msg="教师不存在，请和管理员确认信息是否导入";
                    }else {
                       userService.addUser(ID,passwd);
                       session.setAttribute("userID",ID);
                    }
                }
                str="index";

            }
        }else {
            msg="请确保密码保持一致";
        }
        session.setAttribute("registermsg",msg);
        return str;
    }


}
