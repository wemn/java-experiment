package com.example.service.impl;

import com.example.entity.Student;
import com.example.resource.Database;
import com.example.service.StudentService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> addStudent(Student student) {
        Database.getStudents().add(student);
        return Database.getStudents();
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        return Database.getStudents()
                .stream()
                .filter(s -> s.getYear() == year)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> listStudentsNames(int year, Student.Sex sex) {
        return Database.getStudents()
                .stream()
                .filter(s -> s.getYear() == year)
                .filter(s -> s.getSex() == sex)
                .map(s -> s.getName())
                .collect(Collectors.toList());


    }

    @Override
    public Map<Student.Sex, List<Student>> mapStudentsBySex() {
        return Database.getStudents()
                .stream()
                .collect(Collectors.groupingBy(s -> s.getSex()));
    }

    @Override
    public boolean removeStudent(int id) {
        return Database.getStudents()
                .removeIf(s -> s.getId() == id);
    }
}
