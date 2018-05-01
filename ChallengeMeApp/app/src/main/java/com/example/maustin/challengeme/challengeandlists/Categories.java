package com.example.maustin.challengeme.challengeandlists;

import com.example.maustin.challengeme.tasksandlists.Task;

import java.io.Serializable;
import java.util.ArrayList;

public class Categories implements Serializable{
    ArrayList<Category> allCategories;

    public Categories() {
        this.allCategories = seedEverything();
    }

    public Category getCategory(String name){

        for (Category c : allCategories){
            if (c.getName().equals(name)){
                return c;
            }
        }
        return allCategories.get(0); // if not found return the first one
    }

    private ArrayList<Category> seedEverything(){

        ArrayList<Task>  yogaTaskList = new ArrayList<Task>();
        yogaTaskList.add(new Task(1, "This is the first task", false));
        yogaTaskList.add(new Task(2, "This is the second task", false));
        yogaTaskList.add(new Task(3, "This is the third task", false));
        yogaTaskList.add(new Task(4, "This is the fourth task", false));
        yogaTaskList.add(new Task(5, "This is the fifth task", false));
        yogaTaskList.add(new Task(6, "This is the sixth task", false));
        yogaTaskList.add(new Task(7, "This is the seventh task", false));
        yogaTaskList.add(new Task(8, "This is the eighth task", false));
        yogaTaskList.add(new Task(9, "This is the ninth task", false));
        yogaTaskList.add(new Task(10, "This is the tenth task", false));

        ArrayList<Task>  mayPhotoTaskList = new ArrayList<Task>();
        mayPhotoTaskList.add(new Task(1, "Take photo", false));
        mayPhotoTaskList.add(new Task(2, "Take another photo", false));
        mayPhotoTaskList.add(new Task(3, "Take a third photo", false));
        mayPhotoTaskList.add(new Task(4, "Take yet another photo", false));
        mayPhotoTaskList.add(new Task(5, "Take yet another photo after that", false));



        ArrayList<Challenge> exerciseChallenges = new ArrayList<Challenge>();
        exerciseChallenges.add(new Challenge("Yoga Challenge", "This is the first challenge", yogaTaskList));
        exerciseChallenges.add(new Challenge("Ab Challenge", "This is the second challenge", yogaTaskList));
//        exerciseChallenges.add(new Challenge("Push up Challenge", "This is the third challenge", yogaTaskList));
//        exerciseChallenges.add(new Challenge("0 to 5K", "This is the fourth challenge", yogaTaskList));
//        exerciseChallenges.add(new Challenge("Vogue Challenge", "This is the fifth challenge", yogaTaskList));

        ArrayList<Challenge> photographyChallenges = new ArrayList<Challenge>();
        photographyChallenges.add(new Challenge("May Photo Challenge", "Take photos in May", mayPhotoTaskList));
        photographyChallenges.add(new Challenge("Food Photo Challenge", "Combine with a food challenge", mayPhotoTaskList));
//        photographyChallenges.add(new Challenge("Fashion Photo Challenge", "Your own looks or others", mayPhotoTaskList));
//        photographyChallenges.add(new Challenge("Nature Photo Challenge", "Springtime and nature is blooming", mayPhotoTaskList));
//        photographyChallenges.add(new Challenge("Selfie Challenge", "Take a photo of you!", mayPhotoTaskList));

        Category c1 = new Category(exerciseChallenges, "exercise");
        Category c2 = new Category(photographyChallenges, "photography");

        ArrayList<Category> newCategories = new ArrayList<Category>();
        newCategories.add(c1);
        newCategories.add(c2);

         return newCategories;

    }
}
