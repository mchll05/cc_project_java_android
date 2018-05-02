package com.example.maustin.challengeme;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.maustin.challengeme.categoriesandchallenges.Challenge;
import com.example.maustin.challengeme.categoriesandchallenges.ChallengeAdapter;
import com.example.maustin.challengeme.sharedpref.ApplicationState;
import com.example.maustin.challengeme.sharedpref.SharedPreferencesHelper;

import java.util.ArrayList;

public class MyChallengesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_challenges);

        Intent intent = getIntent();
        Challenge challengeToAddToCollection = (Challenge) intent.getSerializableExtra("challenge");


        ApplicationState applicationState = SharedPreferencesHelper.loadApplicationState(this);

//        applicationState.getCategories().add(challengeToAddToCollection);

        SharedPreferencesHelper.saveApplicationState(this, applicationState);

        ChallengeAdapter challengeNamesArrayAdapter = new ChallengeAdapter(this, applicationState.getCategories().getMyChallengesFromAllCategories());

        ListView challengeNamesListView = (ListView) findViewById(R.id.currentChallenges);
        challengeNamesListView.setAdapter(challengeNamesArrayAdapter);
    }
}



//        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
//        String myChallenges = sharedPref.getString("MyChallenges", "{}");
//
//        Intent intent = getIntent();
//        Challenge challengeToAddToCollection = (Challenge) intent.getSerializableExtra("challenge");
//
//        ApplicationState applicationState = SharedPreferencesHelper.loadApplicationState(this);
//        applicationState.getMyChallenges().add(challengeToAddToCollection);
//        SharedPreferencesHelper.saveApplicationState(this, applicationState);
//    }
//}
