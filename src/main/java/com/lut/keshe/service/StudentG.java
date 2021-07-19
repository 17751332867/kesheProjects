package com.lut.keshe.service;

import com.lut.keshe.pojo.STTLink;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2021/7/16.
 */
public interface StudentG {

    public boolean StudentselectTimu(HttpSession session, int studentId,String timuName,int teacherId);
}
