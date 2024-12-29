package com.example.task_manager.Entity;


public class TaskEntity {
    private int id;
    private String Name;
    private String Description;

    private String Status;
    private Boolean Completed;

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getStatus() {
        return Status;
    }

    public Boolean getCompleted() {
        return Completed;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setCompleted(Boolean completed) {
        Completed = completed;
    }
}
