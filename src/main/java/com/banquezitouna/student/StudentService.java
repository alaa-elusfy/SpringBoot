package com.banquezitouna.student;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {
    Student save(Student student);
    List<Student> findAllStudents();
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteByEmail(String email);
}