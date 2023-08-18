package com.zisarz.test.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/allStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/registerStudent")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

}
