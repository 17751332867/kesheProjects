package com.lut.keshe.service;

import com.lut.keshe.pojo.SOG;

import java.util.List;

/**
 * Created by ASUS on 2021/7/15.
 */
public interface SOGService {

    public List<SOG> findALLSOG();
    public SOG selectSOGByID(int studentID);
    public boolean insertSOG(SOG sog);
    public boolean deleteSOG(int studentID);
    public boolean updateSog(SOG sog);
}
