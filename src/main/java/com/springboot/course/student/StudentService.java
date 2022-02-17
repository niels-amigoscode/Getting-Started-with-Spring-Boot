package com.springboot.course.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Niels",
                        "niels.hendrickx@hotmail.com",
                        LocalDate.of(1996, 8, 10),
                        25
                )
        );
    }
}
