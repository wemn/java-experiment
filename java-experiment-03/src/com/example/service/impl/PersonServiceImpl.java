package com.example.service.impl;

import com.example.entity.Person;
import com.example.resource.Database;
import com.example.service.PersonService;

public abstract class PersonServiceImpl implements PersonService {
    @Override
    public Person findbyId(int id) {
        Person person = null;
        for (Person p : Database.getPersons()) {
            if (p.getId() == id) {
                person = p;
            }
        }
        return person;
    }
}
