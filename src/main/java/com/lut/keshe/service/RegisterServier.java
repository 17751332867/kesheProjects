package com.lut.keshe.service;

import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2021/7/9.
 */
public interface RegisterServier {

    public String Register(HttpSession session,int ID, String passwd, String repasswd);

}
