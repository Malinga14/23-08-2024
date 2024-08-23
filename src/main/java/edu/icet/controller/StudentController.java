package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/add-student")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }
    @GetMapping("/get-student")
    public String getStudent(){
        return service.getStudent().toString();
    }
}
