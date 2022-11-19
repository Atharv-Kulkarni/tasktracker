package com.example.tasktracker.repo;

import com.example.tasktracker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepo extends JpaRepository<Task, Integer> {

    void deleteTaskById(int id);
}
