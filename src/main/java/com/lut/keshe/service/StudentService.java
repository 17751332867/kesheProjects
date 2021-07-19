package com.lut.keshe.service;

import com.lut.keshe.pojo.Student;

import java.util.List;

/**
 * Created by ASUS on 2021/7/5.
 */
public interface StudentService {
    public List<Student> findAllStudent();
    public Student selectStudentByID(int studentID);
    public boolean updateStudentByID(Student student);
    public boolean deleteStudent(int studentID);
    public boolean addStudent(Student student);
    public boolean InsertStudentID(int ID);
}
