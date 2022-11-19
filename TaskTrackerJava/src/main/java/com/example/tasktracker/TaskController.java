package com.example.tasktracker;

import com.example.tasktracker.model.Task;
import com.example.tasktracker.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskService ts;

    @Autowired
    public TaskController(TaskService ts) {
        this.ts = ts;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Task>> getAllTasks(){
        List<Task> tasks = ts.findAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Task> addTask(@RequestBody Task t){
        Task newTask = ts.addTask(t);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Task> updateTask(@RequestBody Task t){
        Task updateTask = ts.updateTask(t);
        return new ResponseEntity<>(updateTask, HttpStatus.OK);
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable int id){
        ts.deleteTaskById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
