package com.example.maustin.challengeme.challengeandlists;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.maustin.challengeme.R;
import com.example.maustin.challengeme.tasksandlists.Task;

import java.util.ArrayList;

public class ChallengeAdapter extends ArrayAdapter {

    public ChallengeAdapter(Context context, ArrayList<Challenge> challenges) {
        super(context, 0, challenges);

    }

    @Override
    public View getView(int position, View cardItemView, ViewGroup parent){

        if (cardItemView == null) {
            cardItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_category_detail, parent, false);
        }

        Challenge currentChallenge = (Challenge) getItem(position);

        TextView name = (TextView) cardItemView.findViewById(R.id.nameID);
        name.setText(currentChallenge.getName());

//        TextView taskDescription = (TextView) cardItemView.findViewById(R.id.cardID);
//        challengeDescription.setText(currentChallenge.getChallengeDescription());

        return cardItemView;
    }
}
