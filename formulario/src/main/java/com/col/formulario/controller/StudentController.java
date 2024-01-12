package com.col.formulario.controller;

import com.col.formulario.entity.Student;
import com.col.formulario.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/students", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {

    @Autowired

    private StudentService studentService;

    @GetMapping
    public ResponseEntity <List<Student>> getAll(){
        return new ResponseEntity<>(studentService.getStudent(), HttpStatus.OK);
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getBId(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId);
    }

    @PostMapping
    public Student saveOrUpdate (@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student;
    }

    @DeleteMapping("/{studentId}")
    public void saveUpdate (@PathVariable("studentId") Long studentId){
        studentService.delete(studentId);
    }
}
