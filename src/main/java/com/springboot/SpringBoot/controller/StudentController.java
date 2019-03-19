package com.springboot.SpringBoot.controller;

import com.springboot.SpringBoot.entity.Student;
import com.springboot.SpringBoot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping("/")
    public List<Student> getStudents() {
        logger.info("An INFO Message");
        return studentService.getStudents();
    }
}
