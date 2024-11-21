package com.nikolas.student_app.controller;

import com.nikolas.student_app.model.Student;
import com.nikolas.student_app.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return studentRepo.findAll();
    }
}
