package com.example.docker.Docker.exampler.controller;

import com.example.docker.Docker.exampler.dto.Student;
import com.example.docker.Docker.exampler.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Slf4j
public class StudentController {
    private final StudentService studentService;
    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents() {
        return studentService.getAllStudents();
    }
    @PostMapping("/student")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
}
