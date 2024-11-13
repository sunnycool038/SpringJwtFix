package com.securityAPI1.securityAPI1.controller;


import com.securityAPI1.securityAPI1.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private  List<Student> students = new ArrayList<>(List.of(
            new Student(1, "john", 60),
            new Student(2, "Emeka", 70)
    ));

    @GetMapping("/students")
    public List<Student> getStudent(){
        return  students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken GetToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){

        students.add(student);
        return  student;
    }
}
