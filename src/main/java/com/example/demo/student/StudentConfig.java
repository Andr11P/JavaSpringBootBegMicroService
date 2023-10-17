package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student bob = new Student(
                    1L,
                    "Bob",
                    "bob.bob.krutelik@gmail.com",
                    LocalDate.of(2000, FEBRUARY, 7)
            );

            Student alex = new Student(
                    "Alex",
                    "alexkrutelik@gmail.com",
                    LocalDate.of(2004, FEBRUARY, 16)
            );

            repository.saveAll(
                    List.of(bob, alex)
            );
        };
    }
}
