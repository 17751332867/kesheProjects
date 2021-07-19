package com.lut.keshe.pojo;

public class Teacher {
    private Integer teacherID;

    private String teachername;

    private String sex;

    private String professional;

    private String phonenumber;

    private String address;

    private String email;

    private Integer qqnumber;

    public Teacher(Integer teacherID, String teachername, String sex, String professional, String phonenumber, String address, String email, Integer qqnumber) {
        this.teacherID = teacherID;
        this.teachername = teachername;
        this.sex = sex;
        this.professional = professional;
        this.phonenumber = phonenumber;
        this.address = address;
        this.email = email;
        this.qqnumber = qqnumber;
    }

    public Teacher() {
        super();
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(Integer qqnumber) {
        this.qqnumber = qqnumber;
    }
}