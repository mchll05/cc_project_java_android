package com.example.maustin.challengeme.categoriesandchallenges;

import com.example.maustin.challengeme.tasks.Task;

import java.io.Serializable;
import java.util.ArrayList;

public class Challenge implements Serializable {

    private String name;
    private String challengeDescription;
    private ArrayList<Task> taskList;
    private boolean isCompleted;
    private boolean isActive;


    public Challenge(String name, String challengeDescription, ArrayList<Task> taskList, boolean isCompleted, boolean isActive) {
        this.name = name;
        this.challengeDescription = challengeDescription;
        this.taskList = taskList;
        this.isCompleted = isCompleted;
        this.isActive = isActive;
    }

    public Challenge(String name, String challengeDescription, ArrayList<Task> taskList) {
        this.name = name;
        this.challengeDescription = challengeDescription;
        this.taskList = taskList;
        this.isCompleted = false;
        this.isActive = false;
    }

    public String getName() {
        return name;
    }

    public String getChallengeDescription() {
        return challengeDescription;
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;

    }
}

