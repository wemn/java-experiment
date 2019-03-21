package com.example.resource;

import com.example.entity.Student;

public class DatabaseUtils {
    private static final Student[] STUDENTS = createStudents();
    /**
     * 创建测试用数组
     *
     * @return
     */
    private static Student[] createStudents() {
        Student stu1 = new Student(1001, "BO", 94, 1);
        Student stu2 = new Student(1021, "SUN", 64, 1);
        Student stu3 = new Student(1024, "ZHANG", 44, 1);
        Student stu4 = new Student(1031, "LIU", 59, 2);
        Student stu5 = new Student(1035, "GUO", 88, 2);
        Student[] students = new Student[] {stu1, stu2, stu3, stu4, stu5};
        return students;
    }
    public static Student[] listStudents() {
        return STUDENTS;
    }
}
