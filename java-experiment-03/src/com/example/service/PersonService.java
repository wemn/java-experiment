package com.example.service;

import com.example.entity.Person;

public interface PersonService {
    /**
     * 实现，模拟基于编号获取用户
     * @param id
     * @return
     */
    Person findbyId(int id);
}
