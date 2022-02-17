package com.springboot.course.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student niels = new Student(
                    1L,
                    "Niels",
                    "niels.hendrickx@hotmail.com",
                    LocalDate.of(1996, 8, 10)
            );
            Student birgit = new Student(
                    "Birgit",
                    "birgit@gmail.com",
                    LocalDate.of(1997, 2, 10)
            );

            studentRepository.saveAll(List.of(niels,birgit));

        };
    }
}
