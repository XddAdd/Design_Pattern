package com.add;

public class Waiter {
    public Meal getMeal(){
        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.makeRice("大米");
        mealBuilder.makeNoodle("刀削面");
        mealBuilder.makeBeef("牛肉");
        mealBuilder.build();
        return mealBuilder.build();
    }
}
