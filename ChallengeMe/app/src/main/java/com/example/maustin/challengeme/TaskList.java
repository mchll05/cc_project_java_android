package com.example.maustin.challengeme;

import com.example.maustin.challengeme.Task;

import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> list;

    public TaskList() {
        list = new ArrayList<Task>();
        list.add(new Task(1, "This is the first task", false));
        list.add(new Task(2, "This is the second task", false));
        list.add(new Task(3, "This is the third task", false));
        list.add(new Task(4, "This is the fourth task", false));
        list.add(new Task(5, "This is the fifth task", false));
        list.add(new Task(6, "This is the sixth task", false));
        list.add(new Task(7, "This is the seventh task", false));
        list.add(new Task(8, "This is the eighth task", false));
        list.add(new Task(9, "This is the ninth task", false));
        list.add(new Task(10, "This is the tenth task", false));

    }

    public ArrayList<Task> getList() {
        return new ArrayList<Task>(list);
    }

}

