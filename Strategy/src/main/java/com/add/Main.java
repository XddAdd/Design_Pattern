package com.add;

public class Main {

    public static void main(String[] args) {
        Context context = null;
        int a = 1, b = 2, res;
        context = new Context(new AddStrategy());
        res = context.executeStrategy(a, b);
        System.out.println(res);

        context = new Context((new SubStrategy()));
        res = context.executeStrategy(a, b);
        System.out.println(res);

        context = new Context(new MulStrategy());
        res = context.executeStrategy(a, b);
        System.out.println(res);
    }

}
