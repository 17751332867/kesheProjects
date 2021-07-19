package com.lut.keshe.service.impl;

import com.lut.keshe.dao.STTLinkMapper;
import com.lut.keshe.pojo.STTLink;
import com.lut.keshe.pojo.STTLinkExample;
import com.lut.keshe.service.STTLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2021/7/15.
 */

@Service
public class STTLinkServiceImpl implements STTLinkService {

    @Autowired
    STTLinkMapper sttLinkMapper;


    @Override
    public List<STTLink> findAllSTTLink() {
        STTLinkExample sttLinkExample = new STTLinkExample();
        List<STTLink> links = sttLinkMapper.selectByExample(sttLinkExample);
        return links;
    }

    @Override
    public STTLink selectSTTLinkByID(int ID) {
        STTLink sttLink = sttLinkMapper.selectByPrimaryKey(ID);
        return sttLink;
    }

    @Override
    public boolean insertSTTLink(STTLink sttLink) {
        boolean b = false;

        int n = sttLinkMapper.insert(sttLink);
        if(n!=0){
            b=true;
        }
        return b;
    }

    @Override
    public boolean deleteSTTLinkByID(int id) {
        boolean b = false;
        int n = sttLinkMapper.deleteByPrimaryKey(id);
        if(n!=0){
            b = true;
        }
        return b;
    }

    @Override
    public boolean updateSTTLink(STTLink sttLink) {
        boolean b =false;
        int n  = sttLinkMapper.updateByPrimaryKey(sttLink);
        if(n!=0){
            b = true;
        }
        return b;
    }
}
