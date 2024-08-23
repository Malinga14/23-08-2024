package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public void addStudent() {

    }

    @Override
    public List<Student> getStudent() {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Malinga","Kegalle"));
        studentList.add(new Student(2,"Sadeepa","Mahawa"));
        studentList.add(new Student(3,"Chathusha","Galle"));
        return studentList;
    }


}
