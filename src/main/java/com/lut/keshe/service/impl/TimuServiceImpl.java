package com.lut.keshe.service.impl;

import com.lut.keshe.dao.TimuMapper;
import com.lut.keshe.pojo.Timu;
import com.lut.keshe.pojo.TimuExample;
import com.lut.keshe.service.TimuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2021/7/5.
 */
@Service
public class TimuServiceImpl implements TimuService {

    @Autowired
    TimuMapper timuMapper;

    public Timu selectTimuByID(String name) {
        Timu timu;
        timu=timuMapper.selectByPrimaryKey(name);
        return timu;
    }

    public boolean updateTimuByID(Timu timu) {
        boolean b = false;
        int n = timuMapper.updateByPrimaryKey(timu);
        if(n!=0){
            b=true;
        }
        return b;
    }

    public boolean deleteTimu(String name) {
        boolean b = false;
        int n = timuMapper.deleteByPrimaryKey(name);
        if(n!=0){
            b=true;
        }
        return b;
    }

    public boolean addTimu(Timu timu) {
        boolean b = false;
        int n = timuMapper.insert(timu);
        if(n!=0){
            b=true;
        }
        return b;
    }

    @Override
    public List<Timu> findAllTimu() {
        TimuExample timuExample = new TimuExample();
        List<Timu> list = timuMapper.selectByExample(timuExample);
        return list;
    }
}
