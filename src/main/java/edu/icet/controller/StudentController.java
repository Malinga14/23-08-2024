package edu.icet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping
    public String getStudent(){
        return "Saman";
    }
}
