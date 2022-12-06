package com.nest.studentapp_backend.controller;

import com.nest.studentapp_backend.model.students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    @GetMapping("/")
    public String HomePage()
    {
        return "welcome to my website";
    }

    @PostMapping( path = "/add",consumes = "application/json",produces = "application/json")

    public String AddStudent(@RequestBody students s)
    {
        System.out.println(s.toString());
        return "student added sucessfully";
    }
    }

