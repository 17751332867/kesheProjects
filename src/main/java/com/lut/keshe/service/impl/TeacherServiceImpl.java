package com.lut.keshe.service.impl;

import com.lut.keshe.dao.TeacherMapper;
import com.lut.keshe.pojo.Teacher;
import com.lut.keshe.pojo.TeacherExample;
import com.lut.keshe.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2021/7/5.
 */
@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> findAllTeacher() {
        TeacherExample teacherExample = new TeacherExample();
        List<Teacher> list = teacherMapper.selectByExample(teacherExample);
        return list;
    }

    public Teacher selectTeacherByID(int teacherID){
        Teacher teacher;
        teacher=teacherMapper.selectByPrimaryKey(teacherID);
        return teacher;
    }

    public boolean updateTeacherByID(Teacher teacher){
        boolean b=false;
        int n = teacherMapper.updateByPrimaryKey(teacher);
        if(n!=0){
            b=true;
        }
        return b;
    }

    public boolean deleteTeacher(int teacherID){
        boolean b=false;
        int n = teacherMapper.deleteByPrimaryKey(teacherID);
        if(n!=0){
            b=true;
        }
        return b;
    }

    public boolean addTeacher(Teacher teacher){
        boolean b=false;
        int n = teacherMapper.insert(teacher);
        if(n!=0){
            b=true;
        }
        return b;
    }


}
