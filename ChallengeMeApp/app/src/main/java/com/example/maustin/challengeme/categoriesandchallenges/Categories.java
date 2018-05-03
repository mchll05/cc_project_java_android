package com.example.maustin.challengeme.categoriesandchallenges;

import com.example.maustin.challengeme.tasks.Task;

import java.io.Serializable;
import java.util.ArrayList;

public class Categories implements Serializable {
    ArrayList<Category> allCategories;
//    ArrayList<Challenge> myChallenges;//

    public Categories() {
        this.allCategories = seedEverything();
//        this.myChallenges = new ArrayList<>();
    }

    public Category getCategory(String name) {

        for (Category c : allCategories) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return allCategories.get(0); // if not found return the first one
    }

    public ArrayList<Challenge> getActiveFromAllCategories() {
       ArrayList<Challenge> activeChallenges = new ArrayList<Challenge>();
       for (Category category : allCategories) {
           for (Challenge challenge : category.getChallenges()) {
               if (challenge.isActive()) {
                   activeChallenges.add(challenge);
               }
           }
       }
       return activeChallenges;
    }

    public void setChallengeAsActive(Challenge challengeToBeSetActive) {
        for (Category category : allCategories) {
            for (Challenge challenge : category.getChallenges()) {
                if(challenge.getName().equals(challengeToBeSetActive.getName())) {
                    challenge.setActive(true);
                }
            }
        }
    }

    public ArrayList<Challenge> getAllCompletedChallenges() {
        ArrayList<Challenge> completedChallenges = new ArrayList<Challenge>();
        for (Category category : allCategories) {
            for (Challenge challenge : category.getChallenges()) {
                if (challenge.isCompleted()) {
                    completedChallenges.add(challenge);
                }
            }
        }
        return completedChallenges;
    }

    public void setChallengeAsCompleted(Challenge challengeToBeSetComplete) {
        //loop through categories to find category
        for (Category category : allCategories) {
            //loop through challenges to find challenge
            for(Challenge challenge : category.getChallenges()) {
                //if challenge is equal to challengeToBeSetCompleted
                if(challenge.getName().equals(challengeToBeSetComplete.getName())) {
                    //set challenge as true
                    challenge.setCompleted(true);
                }
            }
        }
    }

    private ArrayList<Category> seedEverything() {

        ArrayList<Task> yogaTaskList = new ArrayList<Task>();
        yogaTaskList.add(new Task(1, "Sun Salutation flow for 10 minutes"));
        yogaTaskList.add(new Task(2, "Hold Pyramid and Runner's stretch for 2 minutes on each leg"));
        yogaTaskList.add(new Task(3, "Pigeon pose, 5 minutes on each leg"));
        yogaTaskList.add(new Task(4, "Sun Salutation, introduce Cresent pose, 12 minutes"));
        yogaTaskList.add(new Task(5, "Repeat day 2 with a Prayer Squat"));
        yogaTaskList.add(new Task(6, "Pigeon pose, 10 minutes on each leg"));
        yogaTaskList.add(new Task(7, "Sun Salutation with Cresent, 15 minutes"));
        yogaTaskList.add(new Task(8, "Hold Pyramid/Runner/Prayer with Bridge"));
        yogaTaskList.add(new Task(9, "Practice balance poses for 15 minutes"));
        yogaTaskList.add(new Task(10, "Sun Salutation with Cresent, 18 minutes"));

        ArrayList<Task> mayPhotoTaskList = new ArrayList<Task>();
        mayPhotoTaskList.add(new Task(1, "Something in bloom"));
        mayPhotoTaskList.add(new Task(2, "Something interesting you walk by every day"));
        mayPhotoTaskList.add(new Task(3, "Treat yourself and take a photo"));
        mayPhotoTaskList.add(new Task(4, "May the 4th be with you; something geeky!"));
        mayPhotoTaskList.add(new Task(5, "Do something creative today and don't forget to take a picture"));


        ArrayList<Challenge> exerciseChallenges = new ArrayList<Challenge>();
        exerciseChallenges.add(new Challenge("Yoga Flex Super", "This is the first challenge", yogaTaskList));
        exerciseChallenges.add(new Challenge("AB-solutely Fabulous", "This is the second challenge", yogaTaskList));
        exerciseChallenges.add(new Challenge("Push up Challenge", "This is the third challenge", yogaTaskList));
        exerciseChallenges.add(new Challenge("0 to 5K", "This is the fourth challenge", yogaTaskList));
        exerciseChallenges.add(new Challenge("Vogue Challenge", "This is the fifth challenge", yogaTaskList));

        ArrayList<Challenge> photographyChallenges = new ArrayList<Challenge>();
        photographyChallenges.add(new Challenge("May Photo Challenge", "Take photos in May", mayPhotoTaskList));
        photographyChallenges.add(new Challenge("Food Photo Challenge", "Combine with a food challenge", mayPhotoTaskList));
        photographyChallenges.add(new Challenge("Fashion Photo Challenge", "Your own looks or others", mayPhotoTaskList));
        photographyChallenges.add(new Challenge("Nature Photo Challenge", "Springtime and nature is blooming", mayPhotoTaskList));
        photographyChallenges.add(new Challenge("Selfie Challenge", "Take a photo of you!", mayPhotoTaskList));

        Category c1 = new Category(exerciseChallenges, "exercise");
        Category c2 = new Category(photographyChallenges, "photography");

        ArrayList<Category> newCategories = new ArrayList<Category>();
        newCategories.add(c1);
        newCategories.add(c2);

        return newCategories;

    }


}
