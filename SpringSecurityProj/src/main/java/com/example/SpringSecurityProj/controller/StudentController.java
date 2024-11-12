package com.example.SpringSecurityProj.controller;

import java.util.*;
import java.util.ArrayList;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecurityProj.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(new Student("rahul",12,78),
                                                    new Student("abhi",13,88)));



    @GetMapping("/csrf-token")
    public CsrfToken getcsrftoken(HttpServletRequest req){
        return (CsrfToken)req.getAttribute("_csrf");
    }                                                    
    @GetMapping("/students")
    public List<Student> getStudent(){
        return students;
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student newstudent){
        students.add(newstudent);
    }

}
