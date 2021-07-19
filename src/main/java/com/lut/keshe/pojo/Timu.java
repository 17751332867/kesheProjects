package com.lut.keshe.pojo;

public class Timu {
    private String name;

    private String timunature;

    private String timutype;

    private Integer timusource;

    public Timu(String name, String timunature, String timutype, Integer timusource) {
        this.name = name;
        this.timunature = timunature;
        this.timutype = timutype;
        this.timusource = timusource;
    }

    public Timu() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTimunature() {
        return timunature;
    }

    public void setTimunature(String timunature) {
        this.timunature = timunature == null ? null : timunature.trim();
    }

    public String getTimutype() {
        return timutype;
    }

    public void setTimutype(String timutype) {
        this.timutype = timutype == null ? null : timutype.trim();
    }

    public Integer getTimusource() {
        return timusource;
    }

    public void setTimusource(Integer timusource) {
        this.timusource = timusource;
    }
}