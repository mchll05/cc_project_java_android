package com.example.maustin.challengeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maustin.challengeme.categoriesandchallenges.Categories;
import com.example.maustin.challengeme.categoriesandchallenges.Category;
import com.example.maustin.challengeme.categoriesandchallenges.Challenge;
import com.example.maustin.challengeme.categoriesandchallenges.ChallengeAdapter;
import com.example.maustin.challengeme.sharedpref.ApplicationState;
import com.example.maustin.challengeme.sharedpref.SharedPreferencesHelper;


public class ChallengeActivity extends AppCompatActivity {

    CardView cardView;
    Button goButton;
    Button addToMyChallengeButton;
    Button removeFromToMyChallengeButton;
    TextView title;
    Category category;
    Categories categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge_layout);

        cardView = findViewById(R.id.cardViewId);
        goButton = findViewById(R.id.challengeBId);
        addToMyChallengeButton = findViewById(R.id.toMyChallengesB);
        removeFromToMyChallengeButton = findViewById(R.id.fromMyChallengesB);


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

    public void onAddToMyChallengesButtonClicked(View button) {
        Challenge tappedChallenge = (Challenge) button.getTag();
        //update button - optional
        Toast.makeText(this, "Added " + tappedChallenge.getName(), Toast.LENGTH_SHORT).show();
        // load the state
        if (SharedPreferencesHelper.loadApplicationState(this).getCategories() != null) {
            categories = SharedPreferencesHelper.loadApplicationState(this).getCategories();
        } else {
            categories = new Categories();
        }
        // make change:
        categories.getMyChallengesFromAllCategories().add(tappedChallenge);
//         save state:
        SharedPreferencesHelper.saveApplicationState(this, new ApplicationState(categories));
    }

    public void onRemoveFromMyChallengesButtonClicked(View button) {
        Challenge tappedChallenge = (Challenge) button.getTag();
        Toast.makeText(this, "Removed " + tappedChallenge.getName(), Toast.LENGTH_SHORT).show();
        if (SharedPreferencesHelper.loadApplicationState(this).getCategories() != null) {
            categories = SharedPreferencesHelper.loadApplicationState(this).getCategories();
        } else {
            categories = new Categories();
        }
        categories.getMyChallengesFromAllCategories().remove(tappedChallenge);
        SharedPreferencesHelper.saveApplicationState(this, new ApplicationState(categories));
    }
}


