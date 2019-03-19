package com.springboot.SpringBoot.repository;

import com.springboot.SpringBoot.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Student, Integer> {

}
