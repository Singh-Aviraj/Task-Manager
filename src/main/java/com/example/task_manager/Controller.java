package com.example.task_manager;

import com.example.task_manager.Entity.TaskEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.task_manager.repository.taskrepository;
import com.example.task_manager.DTOs.TaskDto;
import java.util.List;

@RestController
@RequestMapping("/task")
public class Controller {

    private final taskrepository taskService;

    public Controller(taskrepository taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
        public ResponseEntity<List<TaskEntity>> getTasksList() {
            return ResponseEntity.ok(taskService.getTaskList());
        }
    @GetMapping("/{id}")
    public ResponseEntity<TaskEntity> getTaskById(int id) {

        if (taskService.getTaskBYID(id)==null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(taskService.getTaskBYID(id));
    }

    @PostMapping("/add")
    public ResponseEntity<TaskEntity> addTask(@RequestBody  TaskDto body) {
       var tsk1= taskService.addTask(body.getName(), body.getDescription(), body.getStatus(), body.getCompleted());
        return ResponseEntity.ok(tsk1);
    }

}
