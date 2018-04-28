package com.example.maustin.challengeme;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_detail);

    TaskList taskList = new TaskList();
    ArrayList<Task> list = taskList.getList();

    TaskListAdapter taskListAdapter = new TaskListAdapter(this, list);

    ListView listView = (ListView) findViewById(R.id.list_item);
    listView.setAdapter(taskListAdapter);
    }
}
