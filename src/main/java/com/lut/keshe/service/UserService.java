package com.lut.keshe.service;

/**
 * Created by ASUS on 2021/7/6.
 */
public interface UserService {
    public boolean addUser(int ID,String passwd);
    public boolean selectUser(int ID,String passwd);
    public boolean deleteUser(int ID);
    public boolean changePasswd(int ID,String passwd);
}
