package it.develhope.Angelo.InterceptormiddlewareExercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @GetMapping("")
    public String string(){
        return "This is just old code";
    }
}
