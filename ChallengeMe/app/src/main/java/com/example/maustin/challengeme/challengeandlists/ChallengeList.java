package com.example.maustin.challengeme.challengeandlists;

import com.example.maustin.challengeme.tasksandlists.Task;

import java.util.ArrayList;

public class ChallengeList {

        private ArrayList<Challenge> card;

        public ChallengeList() {
            card = new ArrayList<Challenge>();
            card.add(new Challenge("Yoga Challenge", "This is the first challenge"));
            card.add(new Challenge("Ab Challenge", "This is the second challenge"));
            card.add(new Challenge("Push up Challenge", "This is the third challenge"));
            card.add(new Challenge("0 to 5K", "This is the fourth challenge"));
            card.add(new Challenge("Vogue Challenge", "This is the fifth challenge"));

        }

        public ArrayList<Challenge> getCard() {
            return new ArrayList<Challenge>(card);
        }
}
