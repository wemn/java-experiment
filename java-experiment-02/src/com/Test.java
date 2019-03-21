package com;

import com.example.entity.Student;
import com.example.resource.DatabaseUtils;
import com.example.service.StudentService;

public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("----------测试基本数组的声明与for循环-----------");
        testArray();
        System.out.println("----------显示全部学生-----------");
        StudentService.showStudents(DatabaseUtils.listStudents());
        System.out.println("----------平均分-----------");
        float average = StudentService.computAverage(DatabaseUtils.listStudents(), 1);
        System.out.println(average);
    }

    private static void testArray() {
        int[] results = { 94, 64, 55, 59, 88 };
        for (int i = 0; i < results.length; i++) {
            if (results[i] < 60) {
                System.out.println(results[i]);
            }
        }
        for (int i : results) {
            if (i < 60) {
                System.out.println(i);
            }
        }
    }
}
