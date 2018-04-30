package com.example.maustin.challengeme.challengeandlists;

import java.io.Serializable;

public class Challenge implements Serializable {

    private String name;
    private String challengeDescription;


    public Challenge(String name, String challengeDescription) {
        this.name = name;
        this.challengeDescription = challengeDescription;
    }

    public String getName() {
        return name;
    }

    public String getChallengeDescription() {
        return challengeDescription;
    }
}

