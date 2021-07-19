package com.lut.keshe.service.impl;

import com.lut.keshe.dao.SOGMapper;
import com.lut.keshe.pojo.SOG;
import com.lut.keshe.pojo.SOGExample;
import com.lut.keshe.service.SOGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2021/7/15.
 */

@Service
public class SOGServiceImpl implements SOGService {

    @Autowired
    SOGMapper sogMapper;

    @Override
    public List<SOG> findALLSOG() {
        SOGExample sogExample = new SOGExample();
        List<SOG> list = sogMapper.selectByExample(sogExample);
        return list;
    }

    @Override
    public SOG selectSOGByID(int studentID) {
        SOG sog = sogMapper.selectByPrimaryKey(studentID);
        return sog;
    }

    @Override
    public boolean insertSOG(SOG sog) {
        boolean b = false;
        int n = sogMapper.insert(sog);
        if(n!=0){
            b = true;
        }
        return b;
    }

    @Override
    public boolean deleteSOG(int studentID) {
        boolean b = false;
        int n = sogMapper.deleteByPrimaryKey(studentID);
        if(n!=0){
            b = true;
        }
        return b;
    }

    @Override
    public boolean updateSog(SOG sog) {
        boolean b = false;
        int n = sogMapper.updateByPrimaryKey(sog);
        if(n!=0){
            b = true;
        }
        return b;
    }
}
