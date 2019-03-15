package com.example.entity;

import com.example.entity.Department;

public class Employee2 {
    // 员工姓名
    private String name;
    // 员工号
    private int number;
    // 在职
    private boolean service = true;
    // 部门
   private Department department;

    public Employee2(String name, Department department) {
        this.name = name;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
