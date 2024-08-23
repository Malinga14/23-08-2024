package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);
    public List<Student> getStudent();

}
