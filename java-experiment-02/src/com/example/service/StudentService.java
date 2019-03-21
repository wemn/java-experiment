package com.example.service;

import com.example.entity.Student;
import com.example.resource.DatabaseUtils;

public class StudentService {

    /**
     * 基于foreach，打印数组中所有学生的姓名及成绩
     */
    public static void showStudents() {
        Student[] stus = DatabaseUtils.listStudents();
        for (Student s : stus) {
            System.out.println(s.getName() + " / " + s.getResult());
        }
    }

    /**
     * 基于指定学号，指定班级编号，从数组中返回学生对象，学生不存在，返回null
     * @param number
     * @param classNumber
     * @return
     */
    public static Student getStudent(int number, int classNumber) {
        Student student = null;
        for (Student s : DatabaseUtils.listStudents()) {
            if (s.getNumber() == number && s.getClassNumber() == classNumber) {
                return s;
            }
        }
        return student;
    }

    /**
     * 基于给定班级，计算平均分，班级不存在，为0分
     *
     * @param classNumber
     * @return
     */
    public static float computAverage(int classNumber) {
        float totalScore = 0F;
        int num = 0;
        for (Student s : DatabaseUtils.listStudents()) {
            if (s.getClassNumber() == classNumber) {
                num = num + 1;
                totalScore = totalScore + s.getResult();
            }
        }
        // 如果班级不存在，num = 0，0不能作为除数，则直接返回0
        return num == 0 ? 0 : totalScore / num;
    }
}
