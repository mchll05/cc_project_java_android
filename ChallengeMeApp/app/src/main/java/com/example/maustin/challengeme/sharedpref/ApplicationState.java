package com.example.maustin.challengeme.sharedpref;

import com.example.maustin.challengeme.categoriesandchallenges.Categories;
import com.example.maustin.challengeme.categoriesandchallenges.Challenge;

import java.util.ArrayList;

public class ApplicationState {

    private Categories categories;

    public Categories getCategories() {
        return categories;
    }

    public ApplicationState(Categories categories){
        this.categories = categories;
    }
}
