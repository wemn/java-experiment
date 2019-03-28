package com.example.service.impl;

import com.example.entity.Person;
import com.example.entity.Student;
import com.example.resource.Database;
import com.example.service.StudentService;

public class StudentServiceImpl extends PersonServiceImpl implements StudentService {
    @Override
    public float computAverageScore(String clazz) {
        float total = 0;
        int amount = 0;
        for (Person p: Database.getPersons()) {
            if(p instanceof Student) {
                Student s = (Student) p;
                if (clazz.equals(s.getClazz())) {
                    total = total + s.getScore();
                    amount++;
                }
            }
        }
        return amount == 0 ? 0 : total / amount;
    }
}
