package com.lut.keshe.controller;

import com.lut.keshe.pojo.Teacher;
import com.lut.keshe.pojo.TeacherExample;
import com.lut.keshe.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by ASUS on 2021/7/9.
 */
@Controller
//@RequestMapping("Teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping("findAllTeacher")
    public String AllTeacher(HttpSession session){
        TeacherExample teacherExample = new TeacherExample();
        List<Teacher> list = teacherService.findAllTeacher();
        session.setAttribute("AllTeacher",list);
        return "AdminAllTeacher";
    }

    @RequestMapping("selectByIDTeacher")
    public String selectTeacherByID(HttpSession session,Integer ID){
        teacherService.selectTeacherByID(ID);
        return "";
    }

    @RequestMapping("deleteTeacher")
    public String deleteTeacher(Integer ID){
        teacherService.deleteTeacher(ID);
        return "";
    }

    @RequestMapping("insertTeacher")
    public String insertTeacher(Teacher teacher){
        teacherService.addTeacher(teacher);
        return "";
    }

    @RequestMapping("updateTeacher")
    public String updateTeacher(Teacher teacher){
        teacherService.updateTeacherByID(teacher);
        return "";
    }

}
