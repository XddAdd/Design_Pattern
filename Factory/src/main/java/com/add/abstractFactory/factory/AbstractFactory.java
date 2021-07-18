package com.add.abstractFactory.factory;

import com.add.abstractFactory.Color;
import com.add.abstractFactory.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
