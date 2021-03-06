package com.example.maustin.challengeme.categoriesandchallenges;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.maustin.challengeme.R;

import java.util.ArrayList;

public class ChallengeAdapter extends ArrayAdapter {

    public ChallengeAdapter(Context context, ArrayList<Challenge> challenges) {
        super(context, 0, challenges);

    }

    @Override
    public View getView(int position, View cardItemView, ViewGroup parent){

        if (cardItemView == null) {
            cardItemView = LayoutInflater.from(getContext()).inflate(R.layout.challenge_item, parent, false);
        }

        Challenge currentChallenge = (Challenge) getItem(position);

        TextView name = (TextView) cardItemView.findViewById(R.id.nameID);
        name.setText(currentChallenge.getName());

        TextView description = (TextView) cardItemView.findViewById(R.id.descriptionID);
        description.setText(currentChallenge.getChallengeDescription());

        Button goButton = (Button) cardItemView.findViewById(R.id.challengeBId);
        goButton.setTag(currentChallenge);

        Button addToMyChallengeButton = (Button) cardItemView.findViewById(R.id.toMyChallengesB);
        addToMyChallengeButton.setTag(currentChallenge);

        Button removeFromToMyChallengeButton = (Button) cardItemView.findViewById(R.id.fromMyChallengesB);
        removeFromToMyChallengeButton.setTag(currentChallenge);

        return cardItemView;
    }
}
