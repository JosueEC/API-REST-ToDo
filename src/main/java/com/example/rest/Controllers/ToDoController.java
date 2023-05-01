package com.example.rest.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    @GetMapping(value = "/")
    public String holaMundo () {
        return "Hola Mundo!";
    }
}
