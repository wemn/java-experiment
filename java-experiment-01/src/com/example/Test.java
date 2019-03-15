package com.example;

import com.example.entity.Employee;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("BO", 1, "销售");
        System.out.println(employee.getName());
        System.out.println(employee.getDepartName());
        updateEmpoyeeName(employee, "SUN");
        System.out.println(employee.getName());
    }

    /**
     * 需求+1，修改指定员工的姓名
     * @param em
     * @param newName
     */
    private static void updateEmpoyeeName(Employee em, String newName) {
        em.setName(newName);
    }

}
