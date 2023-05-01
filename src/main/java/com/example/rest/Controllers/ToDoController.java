package com.example.rest.Controllers;

import com.example.rest.Models.Task;
import com.example.rest.Repositorys.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping (value = "/")
    public String welcome () {
        return "Welcome to ToDo App!";
    }

    @GetMapping (value = "/tasks")
    public List <Task> getTasks () {
        return taskRepository.findAll();
    }

    @PostMapping (value = "/createTask")
    public String postTask (@RequestBody Task task) {
        taskRepository.save(task);
        return "Task Created";
    }
}
