package com.example.maustin.challengeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.maustin.challengeme.categoriesandchallenges.Challenge;
import com.example.maustin.challengeme.tasks.TaskListAdapter;

public class TaskActivity extends AppCompatActivity {

    Challenge challenge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        challenge = (Challenge) extras.getSerializable("challenge");

        TaskListAdapter taskListAdapter = new TaskListAdapter(this, challenge.getTaskList());

        ListView listView = (ListView) findViewById(R.id.taskListId);
        listView.setAdapter(taskListAdapter);


    }
}
