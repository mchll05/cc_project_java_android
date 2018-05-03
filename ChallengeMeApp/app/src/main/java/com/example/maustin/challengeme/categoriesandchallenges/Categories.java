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
        yogaTaskList.add(new Task(4, "Sun Salutation, introduce Crescent pose, 12 minutes"));
        yogaTaskList.add(new Task(5, "Repeat day 2 with a Prayer Squat"));
        yogaTaskList.add(new Task(6, "Pigeon pose, 10 minutes on each leg"));
        yogaTaskList.add(new Task(7, "Sun Salutation with Crescent, 15 minutes"));
        yogaTaskList.add(new Task(8, "Hold Pyramid/Runner/Prayer with Bridge"));
        yogaTaskList.add(new Task(9, "Practice balance poses for 15 minutes"));
        yogaTaskList.add(new Task(10, "Sun Salutation with Crescent, 18 minutes"));

        ArrayList<Task> absTaskList = new ArrayList<Task>();
        absTaskList.add(new Task(1, "10 Crunches, 16 Bicycle Crunches, 5 Leg raises, 10 seconds Plank"));
        absTaskList.add(new Task(2, "12 Crunches, 20 Bicycle Crunches, 8 Leg raises, 15 seconds Plank"));
        absTaskList.add(new Task(3, "16 Crunches, 26 Bicycle Crunches, 10 Leg raises, 20 seconds Plank"));
        absTaskList.add(new Task(4, "20 Crunches, 32 Bicycle Crunches, 12 Leg raises, 25 seconds Plank"));
        absTaskList.add(new Task(5, "24 Crunches, 36 Bicycle Crunches, 14 Leg raises, 30 seconds Plank"));
        absTaskList.add(new Task(6, "28 Crunches, 42 Bicycle Crunches, 16 Leg raises, 35 seconds Plank"));
        absTaskList.add(new Task(7, "32 Crunches, 50 Bicycle Crunches, 18 Leg raises, 40 seconds Plank"));
        absTaskList.add(new Task(8, "35 Crunches, 56 Bicycle Crunches, 20 Leg raises, 45 seconds Plank"));
        absTaskList.add(new Task(9, "40 Crunches, 60 Bicycle Crunches, 22 Leg raises, 50 seconds Plank"));
        absTaskList.add(new Task(10, "50 Crunches, 70 Bicycle Crunches, 24 Leg raises, 60 seconds Plank"));

        ArrayList<Task> mayPhotoTaskList = new ArrayList<Task>();
        mayPhotoTaskList.add(new Task(1, "Something in bloom"));
        mayPhotoTaskList.add(new Task(2, "Something interesting you walk by every day"));
        mayPhotoTaskList.add(new Task(3, "Treat yourself and take a photo"));
        mayPhotoTaskList.add(new Task(4, "May the 4th be with you; something geeky!"));
        mayPhotoTaskList.add(new Task(5, "Do something creative today and don't forget to take a picture"));


        ArrayList<Challenge> exerciseChallenges = new ArrayList<Challenge>();
        exerciseChallenges.add(new Challenge("Yoga Flex Super", "Stretch your way to flexibility", yogaTaskList));
        exerciseChallenges.add(new Challenge("AB-solutely Fabulous", "Intenser by the day", absTaskList));
        exerciseChallenges.add(new Challenge("Push up Challenge", "Welcome to the Gun Show", yogaTaskList));
        exerciseChallenges.add(new Challenge("0 to 5K", "In just 8 weeks!", yogaTaskList));
        exerciseChallenges.add(new Challenge("Vogue Challenge", "Sissy that walk", yogaTaskList));

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
