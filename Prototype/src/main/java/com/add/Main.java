package com.add;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        People p1 = new People("add", new Date(0));
        People p2 = (People) p1.clone();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2); //判断是否是同一个对象

        p2.setName("xdd");
        p2.setBirthday(new Date(100000));
        System.out.println(p1);
        System.out.println(p2);

    }
}
