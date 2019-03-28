package com.example.service.impl;

import com.example.entity.Person;
import com.example.entity.Teacher;
import com.example.resource.Database;
import com.example.service.PersonService;
import com.example.service.TeacherService;

public class TeacherServiceImpl extends PersonServiceImpl implements TeacherService {
    @Override
    public int computeTotalPublications(String title) {
        int total = 0;
        for (Person p: Database.getPersons()) {
            if (p instanceof Teacher) {
                Teacher t = (Teacher) p;
                if (title.equals(t.getTitle())) {
                    total = total + t.getPublications();
                }
            }
        }
        return total;
    }
}
