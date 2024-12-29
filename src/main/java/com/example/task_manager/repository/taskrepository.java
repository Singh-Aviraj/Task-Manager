package com.example.task_manager.repository;
import com.example.task_manager.Entity.TaskEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class taskrepository {
    private ArrayList<TaskEntity> taskList = new ArrayList<>();
    private int task1 = 1;

     public TaskEntity addTask(String name, String description, String status, Boolean completed) {
        TaskEntity task = new TaskEntity();
        task.setId(task1);
        task.setName(name);
        task.setDescription(description);

        task.setStatus(status);
        task.setCompleted(completed);

        taskList.add(task);
        task1++;
        return task;

    }

    public ArrayList<TaskEntity> getTaskList() {
        return taskList;
    }

   public TaskEntity getTaskBYID(int id){
        for (TaskEntity task : taskList) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

}
