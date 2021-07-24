package com.add;

public class MulStrategy implements Strategy{
    @Override
    public int work(int a, int b) {
        return a * b;
    }
}
