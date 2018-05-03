package com.example.maustin.challengeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.maustin.challengeme.categoriesandchallenges.Categories;
import com.example.maustin.challengeme.categoriesandchallenges.Challenge;
import com.example.maustin.challengeme.categoriesandchallenges.ChallengeAdapter;
import com.example.maustin.challengeme.sharedpref.ApplicationState;
import com.example.maustin.challengeme.sharedpref.SharedPreferencesHelper;

public class MyChallengesActivity extends AppCompatActivity {

    Button createButton;
    ApplicationState applicationState;
    Categories categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_challenges);

        createButton = findViewById(R.id.createChallengeB);

        Intent intent = getIntent();
        Challenge challengeToAddToCollection = (Challenge) intent.getSerializableExtra("challenge");

        applicationState = SharedPreferencesHelper.loadApplicationState(this);
        SharedPreferencesHelper.saveApplicationState(this, applicationState);
        ChallengeAdapter challengeNamesArrayAdapter = new ChallengeAdapter(this, applicationState.getCategories().getActiveFromAllCategories());

        ListView challengeNamesListView = (ListView) findViewById(R.id.currentChallenges);
        challengeNamesListView.setAdapter(challengeNamesArrayAdapter);



        ChallengeAdapter completedArrayAdapter = new ChallengeAdapter(this, applicationState.getCategories().getAllCompletedChallenges());

        ListView completeChallengeListView = (ListView) findViewById(R.id.completedChallenges);
        completeChallengeListView.setAdapter(completedArrayAdapter);
    }

    public void onCreateNewChallengeButtonClick(View button) {
        Intent intent = new Intent(this, UserCreatesActivity.class);
        startActivity(intent);
    }

    public void onRemoveFromMyChallengesButtonClicked(View button) {
        Challenge tappedChallenge = (Challenge) button.getTag();
        Toast.makeText(this, "Removed " + tappedChallenge.getName(), Toast.LENGTH_SHORT).show();
//        if (SharedPreferencesHelper.loadApplicationState(this).getCategories() != null) {
//            categories = SharedPreferencesHelper.loadApplicationState(this).getCategories();
//        } else {
//            categories = new Categories();
//        }
        categories = applicationState.getCategories();
        categories.getActiveFromAllCategories().remove(tappedChallenge);
        SharedPreferencesHelper.saveApplicationState(this, new ApplicationState(categories));
        recreate();
    }

    //======================================Menu=======================================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_challenge, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.go_home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}

