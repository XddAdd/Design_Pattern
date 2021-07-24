package com.add;

public class SubStrategy implements Strategy{
    @Override
    public int work(int a, int b) {
        return a - b;
    }
}
