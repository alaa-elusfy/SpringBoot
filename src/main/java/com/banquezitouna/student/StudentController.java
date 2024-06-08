package com.banquezitouna.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    // 1.Field Injection
    // @Autowired
    private StudentService studentService;

    // 2.Constructor Injection(Recommended)
    // @Autowired // (In newer versions of Spring, it is not mandatory)
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student save(
            @RequestBody Student student
    ) {
        return studentService.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(
            @PathVariable("email") String email
    ) {
        return studentService.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(
            @RequestBody Student student
    ){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{email}")
    public void delete(
            @PathVariable("email") String email
    ) {
        studentService.deleteByEmail(email);
    }
}