package com.example.maustin.challengeme;

import java.io.Serializable;

public class Task implements Serializable {

    private Integer number;
    private String taskDescription;

    public Task(Integer number, String taskDescription) {
        this.number = number;
        this.taskDescription = taskDescription;

    }

    public Integer getNumber() {
        return number;
    }

    public String getTask() {
        return taskDescription;
    }
}
