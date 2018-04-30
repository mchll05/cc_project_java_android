package com.example.maustin.challengeme;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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

    public void onCategoryButtonClicked(View button) {
        Intent intent = new Intent(this, CategoryDetailActivity.class);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.user_profile) {
            Toast.makeText(MainActivity.this, R.string.menu_toast_hello,
                    Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

