package com.studentaddressapp.student.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.studentaddressapp.exceptions.EntityNotFoundException;
import com.studentaddressapp.student.model.Student;
import com.studentaddressapp.student.service.StudentService;

import java.net.http.HttpHeaders;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // headers needed if there will be authentication

    @GetMapping
    public List<Student> getAllStudents(@RequestHeader HttpHeaders headers) {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentByID(@RequestHeader HttpHeaders headers, @PathVariable int id) {

        try{
            return studentService.getStudentByID(id);
        }
        catch (EntityNotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    e.getMessage());
        }
    }







}
