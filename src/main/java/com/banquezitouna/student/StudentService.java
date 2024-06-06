package com.banquezitouna.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Alaa",
                        "Yousfi",
                        LocalDate.now(),
                        "alaaelusfy@gmail.com",
                        25
                ),
                new Student(
                        "Walaa",
                        "Yousfi",
                        LocalDate.now(),
                        "walayousfi@gmail.com",
                        20
                )
        );
    }
}