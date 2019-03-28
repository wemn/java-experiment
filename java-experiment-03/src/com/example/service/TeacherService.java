package com.example.service;

public interface TeacherService extends PersonService {

    /**
     * 计算指定职称教师的出版刊物总数
     * @param title
     * @return
     */
    int computeTotalPublications(String title);
}
