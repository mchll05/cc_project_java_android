package com.example.maustin.challengeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.maustin.challengeme.challengeandlists.ChallengeAdapter;
import com.example.maustin.challengeme.challengeandlists.ChallengeList;
import com.example.maustin.challengeme.tasksandlists.TaskListAdapter;


public class CategoryDetailActivity extends AppCompatActivity {

    CardView cardView;
    Button yogaButton;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge_list);

        cardView = findViewById(R.id.cardViewId);
        yogaButton = findViewById(R.id.challengeBId);

        ChallengeList challengeList = new ChallengeList();
        ChallengeAdapter challengeAdapter = new ChallengeAdapter(this, challengeList.getCard());

        ListView listView = (ListView) findViewById(R.id.challengeListID);
        listView.setAdapter(challengeAdapter);


    }

    public void onChallengeButtonClicked(View button){
        Log.d("fdgd", "onChallengeButtonClicked was called");
        Intent intent = new Intent(this, ListDetailActivity.class );
        startActivity(intent);
    }
}
