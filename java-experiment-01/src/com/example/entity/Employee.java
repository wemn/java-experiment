package com.example.entity;

public class Employee {
    // 员工姓名
    private String name;
    // 员工号
    private int number;
    // 在职
    private boolean service = true;
    // 部门编号
    private int departNumber;
    // 部门名称
    private String departName;

    /**
     * 基于姓名，部门编号，部门名称，初始化员工
     * @param name 员工姓名
     * @param departNumber 部门编号
     * @param departName 部门名称
     */
    public Employee(String name, int departNumber, String departName) {
        this.name = name;
        this.departNumber = departNumber;
        this.departName = departName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
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
