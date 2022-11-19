package com.example.tasktracker.service;

import com.example.tasktracker.model.Task;
import com.example.tasktracker.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepo tr;

    @Autowired
    public TaskService(TaskRepo tr) {
        this.tr = tr;
    }

    public Task addTask(Task t){
        return tr.save(t);
    }

    public List<Task> findAllTasks(){
        return tr.findAll();
    }

    public Task updateTask(Task t){
        return tr.save(t);
    }

    public void deleteTaskById(int id){
        tr.deleteTaskById(id);
    }
}
