package com.example;

import com.example.entity.Employee2;
import com.example.entity.Department;

public class Test2 {
    public static void main(String[] args) {
        // 创建部门对象
        Department depart = new Department(2, "市场");
        Employee2 em = new Employee2("SUN", depart);
    }
}
