package com.example.docker.Docker.exampler.service;

import com.example.docker.Docker.exampler.dto.Student;
import com.example.docker.Docker.exampler.entity.StudentEntity;
import com.example.docker.Docker.exampler.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class StudentService {
    private final StudentRepository studentRepository;

    public ResponseEntity<?> getAllStudents() {
        return ResponseEntity.ok(studentRepository.findAll());
    }
    public ResponseEntity<?> addStudent(Student student) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(student.getName());
        studentEntity.setEmail(student.getEmail());
        studentRepository.save(studentEntity);
        return ResponseEntity.ok("Student added successfully");
    }

}
