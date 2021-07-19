package com.lut.keshe.controller;

import com.lut.keshe.pojo.Student;
import com.lut.keshe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by ASUS on 2021/7/9.
 */
//@RequestMapping("Student")
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("findAllS")
    public String FindAllStudent(HttpSession session){
        List<Student> list = studentService.findAllStudent();
        System.out.print(list);
        session.setAttribute("AllStudent",list);
        return "TeacherAllStudent";
    }

    @RequestMapping("insertS")
    public String insertStudent(Student student){
        studentService.addStudent(student);
        return "";
    }

    @RequestMapping("deleteS")
    public String deleteStudent(Integer ID){
        studentService.deleteStudent(ID);
        return "";
    }

    @RequestMapping("selectByIDS")
    public String selectStudentByID(HttpSession session,Integer ID){
        Student student = studentService.selectStudentByID(ID);
        session.setAttribute("Student",student);
        return "StudentShowInformation";
    }

    @RequestMapping("updateS")
    public String updateStudent(Student student){
        studentService.updateStudentByID(student);
        return "StudentUpdateInformation";
    }
}
