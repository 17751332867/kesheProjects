package com.lut.keshe.pojo;

public class Review {
    private String name;

    private String people;

    private String opinion;

    public Review(String name, String people, String opinion) {
        this.name = name;
        this.people = people;
        this.opinion = opinion;
    }

    public Review() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }
}