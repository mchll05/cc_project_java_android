package com.example.maustin.challengeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.maustin.challengeme.categoriesandchallenges.Challenge;
import com.example.maustin.challengeme.tasks.TaskListAdapter;

public class TaskActivity extends AppCompatActivity {

    Challenge challenge;
    Button completeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        challenge = (Challenge) extras.getSerializable("challenge");

        TaskListAdapter taskListAdapter = new TaskListAdapter(this, challenge.getTaskList());

        completeButton = findViewById(R.id.completeB);

        ListView listView = (ListView) findViewById(R.id.taskListId);
        listView.setAdapter(taskListAdapter);
    }

    public void onCompletedButtonClick(View button) {
        Intent intent = new Intent(this, MyChallengesActivity.class);
        startActivity(intent);
    }
}
