package com.lut.keshe.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by ASUS on 2021/7/5.
 */
@Data

public class user {
    private int userid;
    private String password;

    public user(){

    }

    public user(int userid, String password){
        this.userid=userid;
        this.password=password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
