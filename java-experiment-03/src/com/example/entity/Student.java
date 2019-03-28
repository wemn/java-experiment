package com.example.entity;

public class Student extends Person {
    public static final String CLAZZ_1 = "1班";
    public static final String CLAZZ_2 = "2班";

    private float score;
    private String clazz;

    public Student(int id, String name, float score, String clazz) {
        super(id, name);
        this.score = score;
        this.clazz = clazz;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
