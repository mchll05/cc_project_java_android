package com.example.maustin.challengeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class UserCreatesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_creates);

//        //get the spinner from the xml.
//        Spinner dropdown = findViewById(R.id.spinner1);
//        //create a list of items for the spinner.
//        String[] items = new String[]{"Exercise", "Photography", "Food", "Travel"};
//        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//        //There are multiple variations of this, but this is the basic variant.
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_user_creates, items);
//        //set the spinners adapter to the previously created one.
//        dropdown.setAdapter(adapter);
    }

    public void onSubmitButtonClicked(){

    }


}
