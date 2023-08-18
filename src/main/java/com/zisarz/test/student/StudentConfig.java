package com.zisarz.test.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return  args -> {
            Student alex = new Student ("Alex", "Alex.Stone@email.com", LocalDate.of(1987, Month.AUGUST, 23));
            Student ashish = new Student( "Ashish", "Ashish.Raj@email.com", LocalDate.of(1996, Month.SEPTEMBER, 26) );
            Student rex = new Student( "Rex", "Rex.Rom@email.com", LocalDate.of(1996, Month.OCTOBER, 06) );

            studentRepository.saveAll(List.of(alex, ashish, rex));
        };
    };
}
