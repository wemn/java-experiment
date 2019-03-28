package com.example.resource;

import com.example.entity.Person;
import com.example.entity.Student;
import com.example.entity.Teacher;

import java.util.ArrayList;
import java.util.List;



public class Database {
    private static Person[] persons = create();
    private static Person[] create() {
        Student s1 = new Student(201001, "赵阳阳",88,  Student.CLAZZ_1);
        Student s2 = new Student(201002, "邵鹏",77, Student.CLAZZ_2);
        Student s3 = new Student(201003, "高学斌",78, Student.CLAZZ_2);
        Student s4 = new Student(201011, "李涛",74,  Student.CLAZZ_1);
        Teacher t1 = new Teacher(102001, "刘华", 7, Teacher.LECTURE);
        Teacher t2 = new Teacher(102005, "张羽",6, Teacher.PROFESSOR);
        Person[] p = {s1, s2, s3, s4, t1, t2};
        return p;
    }

    public static Person[] getPersons() {
        return persons;
    }
}
