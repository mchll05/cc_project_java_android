package com.example.maustin.challengeme.javajava;

import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> list;

    public TaskList() {
        list = new ArrayList<Task>();
        list.add(new Task(1, "This is the first task"));
        list.add(new Task(2, "This is the second task"));
        list.add(new Task(3, "This is the third task"));
        list.add(new Task(4, "This is the fourth task"));
        list.add(new Task(5, "This is the fifth task"));
        list.add(new Task(6, "This is the sixth task"));
        list.add(new Task(7, "This is the seventh task"));
        list.add(new Task(8, "This is the eight task"));
        list.add(new Task(9, "This is the ninth task"));
        list.add(new Task(10, "This is the tenth task"));

    }

    public ArrayList<Task> getList() {
        return new ArrayList<Task>(list);
    }

}

