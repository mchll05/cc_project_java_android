package com.example.maustin.challengeme.categoriesandchallenges;

import com.example.maustin.challengeme.tasks.Task;

import java.io.Serializable;
import java.util.ArrayList;

public class Categories implements Serializable{
    ArrayList<Category> allCategories;
    ArrayList<Challenge> myChallenges;

    public Categories() {
        this.allCategories = seedEverything();
        this.myChallenges = new ArrayList<>();
    }

    public Category getCategory(String name){

        for (Category c : allCategories){
            if (c.getName().equals(name)){
                return c;
            }
        }
        return allCategories.get(0); // if not found return the first one
    }

    public ArrayList<Challenge> getMyChallengesFromAllCategories() {
//        ArrayList<Challenge> result = new ArrayList<Challenge>();
//        for (Category category:allCategories) {
//            for(Challenge challenge:category.getChallenges()) {
//                result.add(challenge);
//            }
//        }
        return this.myChallenges;
    }

    private ArrayList<Category> seedEverything(){

        ArrayList<Task>  yogaTaskList = new ArrayList<Task>();
        yogaTaskList.add(new Task(1, "Sun Salutation flow for 10 minutes", false));
        yogaTaskList.add(new Task(2, "Hold Pyramid and Runner's stretch for 2 minutes on each leg", false));
        yogaTaskList.add(new Task(3, "Pigeon pose, 5 minutes on each leg", false));
        yogaTaskList.add(new Task(4, "Sun Salutation, introduce Cresent pose, 12 minutes", false));
        yogaTaskList.add(new Task(5, "Repeat day 2 with a Prayer Squat", false));
        yogaTaskList.add(new Task(6, "Pigeon pose, 10 minutes on each leg", false));
        yogaTaskList.add(new Task(7, "Sun Salutation with Cresent, 15 minutes", false));
        yogaTaskList.add(new Task(8, "Hold Pyramid/Runner/Prayer with Bridge", false));
        yogaTaskList.add(new Task(9, "Practice balance poses for 15 minutes", false));
        yogaTaskList.add(new Task(10, "Sun Salutation with Cresent, 18 minutes", false));

        ArrayList<Task>  mayPhotoTaskList = new ArrayList<Task>();
        mayPhotoTaskList.add(new Task(1, "Something in bloom", false));
        mayPhotoTaskList.add(new Task(2, "Something interesting you walk by every day", false));
        mayPhotoTaskList.add(new Task(3, "Treat yourself and take a photo", false));
        mayPhotoTaskList.add(new Task(4, "May the 4th be with you; something geeky!", false));
        mayPhotoTaskList.add(new Task(5, "Do something creative today and don't forget to take a picture", false));



        ArrayList<Challenge> exerciseChallenges = new ArrayList<Challenge>();
        exerciseChallenges.add(new Challenge("Yoga Flex", "This is the first challenge", yogaTaskList));
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
