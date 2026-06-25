package com.naitik.studentapi.model;

public class Student {

    private int id ;
    private String name;
    private String collage;

    public Student() {
    }

    public Student(int id, String name, String collage) {
        this.id = id;
        this.name = name;
        this.collage = collage ;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
