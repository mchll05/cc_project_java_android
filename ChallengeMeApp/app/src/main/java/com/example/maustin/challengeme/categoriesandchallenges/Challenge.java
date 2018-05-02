package com.example.maustin.challengeme.categoriesandchallenges;

import com.example.maustin.challengeme.tasks.Task;

import java.io.Serializable;
import java.util.ArrayList;

public class Challenge implements Serializable {

    private String name;
    private String challengeDescription;
    private ArrayList<Task> taskList;

    public Challenge(String name, String challengeDescription, ArrayList<Task> taskList) {
        this.name = name;
        this.challengeDescription = challengeDescription;
        this.taskList = taskList;
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
}

