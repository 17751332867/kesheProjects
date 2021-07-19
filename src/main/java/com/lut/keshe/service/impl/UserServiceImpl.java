package com.lut.keshe.service.impl;

import com.lut.keshe.pojo.user;
import com.lut.keshe.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lut.keshe.dao2.userDao;

/**
 * Created by ASUS on 2021/7/6.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    userDao userDao;

    @Override
    public boolean addUser(@Param("userID") int userID, String passwd) {
        Boolean b = false;
        b = userDao.adduser(userID,passwd);
        return b;
    }

    @Override
    public boolean selectUser(int userid, String passwd) {
        boolean b = false;
        user user =  userDao.login(userid,passwd);
        if(user!=null){
            b=true;
        }
        return b;
    }

    @Override
    public boolean deleteUser(int ID) {
        boolean b = false;
        b=userDao.deleteuser(ID);
        return b;
    }

    @Override
    public boolean changePasswd(int ID, String passwd) {
        boolean b = false;
        b=userDao.changePassword(ID,passwd);
        return b;
    }
}
