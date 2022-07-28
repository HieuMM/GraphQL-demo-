package com.example.demographsql.service;

import com.example.demographsql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Value("classpath:student.graphql")
    Resource resource;

}
