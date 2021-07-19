package com.lut.keshe.service;

import com.lut.keshe.pojo.STTLink;

import java.util.List;

/**
 * Created by ASUS on 2021/7/15.
 */
public interface STTLinkService {

    public List<STTLink> findAllSTTLink();
    public STTLink selectSTTLinkByID(int ID);
    public boolean insertSTTLink(STTLink sttLink);
    public boolean deleteSTTLinkByID(int id);
    public boolean updateSTTLink(STTLink sttLink);

}
