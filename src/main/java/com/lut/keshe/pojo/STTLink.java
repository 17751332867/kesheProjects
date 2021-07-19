package com.lut.keshe.pojo;

public class STTLink {
    private Integer studentID;

    private String timuName;

    private Integer teacherID;

    public STTLink(Integer studentID, String timuName, Integer teacherID) {
        this.studentID = studentID;
        this.timuName = timuName;
        this.teacherID = teacherID;
    }

    public STTLink() {
        super();
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getTimuName() {
        return timuName;
    }

    public void setTimuName(String timuName) {
        this.timuName = timuName == null ? null : timuName.trim();
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }
}