package com.example.maustin.challengeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.maustin.challengeme.categoriesandchallenges.Category;
import com.example.maustin.challengeme.categoriesandchallenges.Challenge;
import com.example.maustin.challengeme.categoriesandchallenges.ChallengeAdapter;


public class ChallengeActivity extends AppCompatActivity {

    CardView cardView;
    Button goButton;
    TextView title;
    Category category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge_layout);

        cardView = findViewById(R.id.cardViewId);
        goButton = findViewById(R.id.challengeBId);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        category = (Category) extras.getSerializable("category");

            ChallengeAdapter challengeAdapter = new ChallengeAdapter(this, category.getChallenges());

            ListView listView = (ListView) findViewById(R.id.challengeListID);
            listView.setAdapter(challengeAdapter);
    }

    public void onChallengeButtonClicked(View button) {
        Intent intent = new Intent(this, TaskActivity.class);

        Challenge tappedChallange = (Challenge) button.getTag();
        intent.putExtra("challenge", tappedChallange);
        startActivity(intent);
    }
}


