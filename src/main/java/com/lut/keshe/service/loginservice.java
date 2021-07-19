package com.lut.keshe.service;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2021/7/6.
 */
public interface loginservice {

    public String login(HttpSession session,int ID, String passwd);

}
