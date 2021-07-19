package com.lut.keshe.service.impl;

import com.lut.keshe.pojo.STTLink;
import com.lut.keshe.pojo.Timu;
import com.lut.keshe.service.STTLinkService;
import com.lut.keshe.service.StudentG;
import com.lut.keshe.service.TimuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2021/7/16.
 */
@Service
public class StudentGImpl implements StudentG {

    @Autowired
    STTLinkService sttLinkService;
    @Autowired
    TimuService timuService;

    @Override
    public boolean StudentselectTimu(HttpSession session,int studentId,String timuName,int teacherId) {
        STTLink sttk = sttLinkService.selectSTTLinkByID(studentId);
        System.out.print(studentId);
        if(sttk==null){
            STTLink sttLink = new STTLink(studentId,timuName,teacherId);
            sttLinkService.insertSTTLink(sttLink);
            Timu timu = timuService.selectTimuByID(sttLink.getTimuName());
            session.setAttribute("StudentSelectTimu",timu);
        }else{
            String timumsg="你已选择题目，不可再次选择";
            session.setAttribute("SelectTimumsg",timumsg);
        }

        return  true;
    }
}
