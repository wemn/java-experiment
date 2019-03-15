package com.example.entity;

public class Department {
    // 部门编号
    private int departNumber;
    // 部门名称
    private String departName;

    public Department(int departNumber, String departName) {
        this.departNumber = departNumber;
        this.departName = departName;
    }

    public int getDepartNumber() {
        return departNumber;
    }

    public void setDepartNumber(int departNumber) {
        this.departNumber = departNumber;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
}
