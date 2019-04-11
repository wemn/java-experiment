package com.example;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.example.service.impl.StudentServiceImpl;

public class Test {
    private static StudentService studentService = new StudentServiceImpl();
    public static void main(String[] args) {
        // addStudentTest();
        // listStudentsByYearTest();
        // listStudentsNamesTest();
        mapStudentsBySexTest();
    }

    private static void addStudentTest() {
        Student stu = new Student(201011, Student.Sex.MALE, "BO", 2010);
        studentService.addStudent(stu)
                .forEach(s -> System.out.println(s.getName()));
    }

    private static void listStudentsByYearTest() {
        studentService.listStudentsByYear(2010)
                .forEach(s -> System.out.println(s.getName()));
    }

    private static void listStudentsNamesTest() {
        studentService.listStudentsNames(2010, Student.Sex.MALE)
                .forEach(System.out::println);
    }

    private static void mapStudentsBySexTest() {
        addStudentTest();
        studentService.mapStudentsBySex()
                .forEach((k, v) -> {
                    System.out.println(k);
                    v.forEach(s -> System.out.println(s.getName()));
                });
    }
}
