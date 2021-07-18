package com.add;

public class MealBuilder extends Builder{
    private Meal meal;

    public MealBuilder(){
        meal = new Meal();
    }

    public void makeRice(String rice) {
        meal.setRice(rice);
    }

    public void makeNoodle(String noodle) {
        meal.setNoodle(noodle);
    }

    public void makeBeef(String beef) {
        meal.setBeef(beef);
    }

    public Meal build() {
        return meal;
    }
}
