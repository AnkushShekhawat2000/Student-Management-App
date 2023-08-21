package com.example.studentmanagementapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
      StudentService studentService;


    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo)
    {
        return studentService.getStudent(regNo);
    }


    @PostMapping("/add")
    public String addStudent(@RequestBody Student student)
    {
     return  studentService.addStudent(student);
    }

    @GetMapping("/getPath/{id}")
    public Student getStudentUsigPath(@PathVariable("id ") int regNo)
    {
        return studentService.getStudentUsingPath(regNo);
    }

    @PutMapping("/update-age/{id}")
    public Student updateAge(@PathVariable("id") int regNo, @RequestParam("age") int newAge)
    {
       return studentService.updateAge(regNo,newAge);
    }

    // another way
//    @PutMapping("/update-age/{id}{age}")
//    public Student updateAge(@PathVariable("id") int regNo, @PathVariable("age") int newAge)
//    {
//        db.get(regNo).setAge(newAge);
//
//        return db.get(regNo);
//    }
}


