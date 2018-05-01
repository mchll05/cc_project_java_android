package com.example.maustin.challengeme.tasksandlists;

import java.io.Serializable;

public class Task implements Serializable {

    private Integer number;
    private String taskDescription;
    private boolean taskStatus;

    public Task(Integer number, String taskDescription, boolean taskStatus) {
        this.number = number;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;

    }

    public Integer getNumber() {
        return number;
    }

    public String getTask() {
        return taskDescription;
    }

    public boolean getInitialTaskStatus() {
        return false;
    }

    public boolean taskComplete(){
        return true;
    }

}
