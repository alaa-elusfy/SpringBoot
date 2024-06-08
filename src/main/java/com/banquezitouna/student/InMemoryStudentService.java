package com.banquezitouna.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {
    private final InMemoryStudentDao dao;

    @Autowired
    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    @Override
    public Student save(Student student) {
        return dao.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    @Override
    public void deleteByEmail(String email) {
        dao.deleteByEmail(email);
    }
}