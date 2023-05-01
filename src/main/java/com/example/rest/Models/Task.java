package com.example.rest.Models;

import jakarta.persistence.*;

@Entity
@Table (name = "task")
public class Task {
    @Id
    @SequenceGenerator (
            name = "task_sequence",
            sequenceName = "task_sequence",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "task_sequence"
    )
    private Long id;
    @Column (name = "title")
    private String title;
    @Column (name = "description")
    private String description;

    public Task(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
