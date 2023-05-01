package com.example.rest.Controllers;

import com.example.rest.Models.Task;
import com.example.rest.Repositorys.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping (value = "/")
    public String holaMundo () {
        return "Hola Mundo!";
    }

    @GetMapping (value = "/tasks")
    public List <Task> getTasks () {
        return taskRepository.findAll();
    }
}
