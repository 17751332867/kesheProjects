package com.lut.keshe.service;

import com.lut.keshe.pojo.Teacher;

import java.util.List;

/**
 * Created by ASUS on 2021/7/5.
 */
public interface TeacherService {
    public List<Teacher> findAllTeacher();
    public Teacher selectTeacherByID(int teacherID);
    public boolean updateTeacherByID(Teacher teacher);
    public boolean deleteTeacher(int teacherID);
    public boolean addTeacher(Teacher teacher);
}
