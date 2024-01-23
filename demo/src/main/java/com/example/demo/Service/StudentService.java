package com.example.demo.Service;

import com.example.demo.Entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    Student getStudent(String idStudent) throws  NoSuchFieldException;

    List<Student>getAllStudent();

    Student editStudent(String idStudent, String name, String address) throws NoSuchFieldException;

    void  deleteStudent(String idStudent);
}
