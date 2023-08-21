package com.example.studentmanagementapp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {

    HashMap<Integer,Student> db = new HashMap<>();

    public Student getStudent(int regNo)
    {
        return db.get(regNo);
    }


    public void addStudent(Student student) {

        db.put(student.getRegNo(), student);
        return ;
    }

    public Student getStudentUsingPath(int regNo) {
        return db.get(regNo);
    }

    public Student updateAge(int regNo, int newAge) {
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }
}
