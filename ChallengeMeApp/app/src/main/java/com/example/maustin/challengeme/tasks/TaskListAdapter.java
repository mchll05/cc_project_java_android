package com.example.maustin.challengeme.tasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.maustin.challengeme.R;

import java.util.ArrayList;

public class TaskListAdapter extends ArrayAdapter{

    public TaskListAdapter(Context context, ArrayList<Task> tasks) {
        super(context, 0, tasks);

    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.task_item, parent, false);
        }

            Task currentTask = (Task) getItem(position);

            TextView number = (TextView) listItemView.findViewById(R.id.stepViewId);
            number.setText(currentTask.getNumber().toString());

        listItemView.setTag(currentTask);

        TextView taskDescription = (TextView) listItemView.findViewById(R.id.taskViewId);
        taskDescription.setText(currentTask.getTask().toString());

            return listItemView;
        }
}
