package com.add;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Meal meal = waiter.getMeal();
        System.out.println(meal);
    }
}
