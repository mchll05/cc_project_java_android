package com.example.maustin.challengeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.maustin.challengeme.javajava.Task;
import com.example.maustin.challengeme.javajava.TaskList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TaskList taskList = new TaskList();
    ArrayList<Task> list = taskList.getList();

}
