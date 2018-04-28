package com.example.maustin.challengeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import static java.security.AccessController.getContext;


public class MainActivity extends AppCompatActivity {

    ImageButton exerciseButton;
    ImageButton photographyButton;
    TextView title;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exerciseButton = findViewById(R.id.firstImageBId);
        photographyButton = findViewById(R.id.secondImageBId);
        cardView = findViewById(R.id.cardViewId);
    }

    public void onCategoryButtonClicked(View button){
        Intent intent = new Intent(this, CategoryDetailActivity.class );
        startActivity(intent);

//        Log.d(getClass().toString(), "onCategoryButtonClicked was called");

    }
}
