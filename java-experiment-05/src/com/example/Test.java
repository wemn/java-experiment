package com.example;

import com.example.service.ExamService;
import com.example.service.impl.ExamServiceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    private static final ExamService SERVICE = new ExamServiceImpl();

    public static void main(String[] args) {
        System.out.println("---------测试获取指定日期时间的考试 --------");
        ListExamsByDateTimeTest();
        System.out.println("---------测试获取指定考试持续时间的考试 --------");
        listExamsByDurationMinTest();
        System.out.println("------- 测试获取指定日期的考试 ---------");
        listExamsByDateTest();
        System.out.println("------ 测试学期周数 ---------");
        getWeeksTest();
        System.out.println("------ 测试格式化 ---------");
        formatTest();
    }

    private static void ListExamsByDateTimeTest() {
        LocalDateTime dateTime = LocalDateTime.of(2019, 6, 22, 8, 0);
        SERVICE.listExams(dateTime)
                .forEach(e -> System.out.println(e.getCourseName() + "/" + e.getDate() + "/" + e.getStartTime()));
    }

    private static void listExamsByDateTest() {
        SERVICE.listExams(LocalDate.of(2019, 5, 6))
                .forEach(e -> System.out.println(e.getCourseName() + "/" + e.getDate()));
    }

    private static void listExamsByDurationMinTest() {
        SERVICE.listExams(90)
                .forEach(e -> System.out.println(e.getCourseName() + "/" + e.getStartTime() + "/" + e.getEndTime()));
    }

    private static void getWeeksTest() {
        System.out.println(SERVICE.getWeeks(LocalDate.of(2019, 4, 17)));
    }

    /**
     *
     */
    private static void formatTest() {
        LocalDateTime dateTime = LocalDateTime.of(2019, 6, 22, 8, 0);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("E yyyy/MM/dd HH:mm");
        System.out.println(dateTime.format(df));
    }
}
