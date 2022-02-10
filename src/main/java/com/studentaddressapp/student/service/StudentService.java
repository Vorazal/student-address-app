package com.studentaddressapp.student.service;

import com.studentaddressapp.student.model.Student;

import java.util.List;

public interface StudentService {

    // how to get students
    // by id, firstName, lastName?, getAll?


    List<Student> getAllStudents();

    Student getStudentByID (int id);

    void createStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);


}
