package com.lut.keshe.service.impl;

import com.lut.keshe.dao.StudentMapper;
import com.lut.keshe.pojo.Student;
import com.lut.keshe.pojo.StudentExample;
import com.lut.keshe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2021/7/5.
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> findAllStudent() {
        StudentExample studentExample = new StudentExample();
        List<Student> list = studentMapper.selectByExample(studentExample);
        return list;
    }

    public Student selectStudentByID(int studentID) {
        Student student;
        student=studentMapper.selectByPrimaryKey(studentID);
        return student;
    }

    public boolean updateStudentByID(Student student) {
        boolean b = false;
        int n = studentMapper.updateByPrimaryKey(student);
        if(n!=0){
            b=true;
        }
        return b;
    }

    public boolean deleteStudent(int studentID) {
        boolean b = false;
        int n = studentMapper.deleteByPrimaryKey(studentID);
        if(n!=0){
            b=true;
        }
        return b;
    }

    public boolean addStudent(Student student) {
        boolean b = false;
        int n = studentMapper.insert(student);
        if(n!=0){
            b=true;
        }
        return b;
    }

    @Override
    public boolean InsertStudentID(int ID) {
        boolean b = false;
        return false;
    }
}
