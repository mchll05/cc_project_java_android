package com.example.maustin.challengeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maustin.challengeme.categoriesandchallenges.Categories;
import com.example.maustin.challengeme.categoriesandchallenges.Challenge;


public class MainActivity extends AppCompatActivity {

    ImageButton exerciseButton;
    ImageButton photographyButton;
    Button myButton;
    TextView title;
    CardView cardView;
    Categories categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categories = new Categories();
        exerciseButton = findViewById(R.id.firstImageBId);
        photographyButton = findViewById(R.id.secondImageBId);
        myButton = findViewById(R.id.myChallengesB);
        cardView = findViewById(R.id.cardViewId);

    }

    public void onCategoryButtonClicked(View button) {
        Intent intent = new Intent(this, ChallengeActivity.class);

        if (button == exerciseButton) {
            intent.putExtra("category", categories.getCategory("exercise"));
            startActivity(intent);
        } else if (button == photographyButton) {
            intent.putExtra("category", categories.getCategory("photography"));
            startActivity(intent);
        }
    }

    //------------------------user saved challenges button----------------------------

    public void onMyChallengesButtonClick(View button) {
        Challenge challenge = (Challenge) button.getTag();
        Intent intent = new Intent(this, MyChallengesActivity.class);
        intent.putExtra("challenge", challenge);
        startActivity(intent);
    }

    //+++++++++++++++++++++++++++++++++Menu++++++++++++++++++++++++++++++++++++++++++++++++++++++

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

