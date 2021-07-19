package com.lut.keshe.pojo;

public class SOG {
    private Integer studentID;

    private String opinion;

    private Integer grade;

    public SOG(Integer studentID, String opinion, Integer grade) {
        this.studentID = studentID;
        this.opinion = opinion;
        this.grade = grade;
    }

    public SOG() {
        super();
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}