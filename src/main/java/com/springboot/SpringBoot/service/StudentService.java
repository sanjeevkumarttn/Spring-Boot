package com.springboot.SpringBoot.service;

import com.springboot.SpringBoot.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return Arrays.asList(new Student(12,"Rohan"),
                new Student(11,"Parv"),
                new Student(13,"Aman"));
    }
}
