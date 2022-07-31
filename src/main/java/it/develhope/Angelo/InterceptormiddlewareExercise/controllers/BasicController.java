package it.develhope.Angelo.InterceptormiddlewareExercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("")
    public LocalDateTime dateTime(){
        return LocalDateTime.now();
    }
}
