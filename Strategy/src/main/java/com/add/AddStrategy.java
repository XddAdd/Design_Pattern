package com.add;

public class AddStrategy implements Strategy{
    @Override
    public int work(int a, int b) {
        return a + b;
    }
}
