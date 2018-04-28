package com.example.maustin.challengeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class CategoryDetailActivity extends AppCompatActivity {

    CardView cardView;
    Button yogaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_detail);

        cardView = findViewById(R.id.cardViewId);
        yogaButton = findViewById(R.id.challengeBId);

    }

    public void onChallengeButtonClicked(View button){
        Intent intent = new Intent(this, ListDetailActivity.class );
        startActivity(intent);
    }
}
