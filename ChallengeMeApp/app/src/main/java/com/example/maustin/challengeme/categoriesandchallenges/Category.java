package com.example.maustin.challengeme.categoriesandchallenges;

import java.io.Serializable;
import java.util.ArrayList;

public class Category implements Serializable {
    private ArrayList<Challenge> challenges;
    private String name;

    public Category(ArrayList<Challenge> challenges, String name) {
        this.challenges = challenges;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Challenge> getChallenges() {
        return challenges;
    }
}