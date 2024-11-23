package com.owaisapp.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService
{
    public List<Student> findallstudents(){
        return List.of(
                new Student(
                        "Owais",
                        "Alhadi",
                        LocalDate.now(),
                        "eng.owaisalhadi@gmail.com",
                        24
                ),
                new Student(
                        "Abderhamane",
                        "Mawia2",
                        LocalDate.now(),
                        "eng.owaisalhadi@gmail.com",
                        22
                )
        );
    }
}
