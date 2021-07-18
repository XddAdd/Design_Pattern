package com.add;

public abstract class Builder {
    //上面都是构建对象的多个step
    public abstract void makeRice(String rice);
    public abstract void makeNoodle(String noodle);
    public abstract void makeBeef(String beef);

    //构建对象
    public abstract Meal build(); //一般
}
