package com.shashank.mvcapp.controller;

import com.shashank.mvcapp.model.Student;
import com.shashank.mvcapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    @ResponseBody
    public String saveStudent(@RequestBody Student student) {
        System.out.println("Saving student: " + student.getFirstName());
        studentService.save(student);
        return "success";
    }

    @GetMapping("/studentForm")
    public String showForm() {
        return "studentform";
    }
}
