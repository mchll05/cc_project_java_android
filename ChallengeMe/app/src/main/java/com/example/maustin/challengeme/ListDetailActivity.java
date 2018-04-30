package com.example.maustin.challengeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.maustin.challengeme.tasksandlists.Task;
import com.example.maustin.challengeme.tasksandlists.TaskList;
import com.example.maustin.challengeme.tasksandlists.TaskListAdapter;

import java.util.ArrayList;

public class ListDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_detail);

    final TaskList taskList = new TaskList();
    ArrayList<Task> list = taskList.getList();


    TaskListAdapter taskListAdapter = new TaskListAdapter(this, list);

    ListView listView = (ListView) findViewById(R.id.taskListId);
    listView.setAdapter(taskListAdapter);

//    listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

//        @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//
//            Toast.makeText(ListDetailActivity.this, position, Toast.LENGTH_LONG).show();
//                return true;
//            }
//        });
    }
}
