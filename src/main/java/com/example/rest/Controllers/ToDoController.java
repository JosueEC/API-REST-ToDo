package com.example.rest.Controllers;

import com.example.rest.Models.Task;
import com.example.rest.Repositorys.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping (value = "/updateTask/{id}")
    public String updateTask (@RequestBody Task task, @PathVariable Long id) {
        Task updatedTask = taskRepository.findById(id).get();
        updatedTask.setTitle(task.getTitle());
        updatedTask.setDescription(task.getDescription());
        taskRepository.save(updatedTask);
        return "Task updated";
    }

    @DeleteMapping (value = "/deleteTask/{id}")
    public String deleteTask (@PathVariable Long id) {
        taskRepository.deleteById(id);
        return "Task deleted";
    }
}
