package com.example.maustin.challengeme.sharedpref;

import com.example.maustin.challengeme.categoriesandchallenges.Challenge;

import java.util.ArrayList;

public class ApplicationState {

    private ArrayList<Challenge> myChallenges;
    private String userName;

    public ApplicationState(String userName){
        this.userName = userName;
        this.myChallenges = new ArrayList<Challenge>();
    }

    public ArrayList<Challenge> getMyChallenges() {
        return myChallenges;
    }

    public void setMyChallenges(ArrayList<Challenge> myChallenges) {
        this.myChallenges = myChallenges;
    }
}
