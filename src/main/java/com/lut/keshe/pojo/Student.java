package com.lut.keshe.pojo;

public class Student {
    private Integer studentID;

    private String name;

    private String sex;

    private String specialty;

    private String banji;

    private String phonenumber;

    private String email;

    private Integer qqnumber;

    public Student(Integer studentID, String name, String sex, String specialty, String banji, String phonenumber, String email, Integer qqnumber) {
        this.studentID = studentID;
        this.name = name;
        this.sex = sex;
        this.specialty = specialty;
        this.banji = banji;
        this.phonenumber = phonenumber;
        this.email = email;
        this.qqnumber = qqnumber;
    }

    public Student() {
        super();
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji == null ? null : banji.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
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