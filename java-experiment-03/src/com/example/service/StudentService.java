package com.example.service;

import com.example.entity.Student;

import java.util.List;

public interface StudentService extends PersonService {
    /**
     * 计算指定班级的平均分
     * @param clazz
     * @return
     */
    float computAverageScore(String clazz);

}
