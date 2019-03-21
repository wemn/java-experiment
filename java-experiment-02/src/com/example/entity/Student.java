package com.example.entity;

public class Student {
    private int number;
    private String name;
    private int result;
    private int classNumber;

    public Student(int number, String name, int result, int classNumber) {
        this.number = number;
        this.name = name;
        this.result = result;
        this.classNumber = classNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
}
