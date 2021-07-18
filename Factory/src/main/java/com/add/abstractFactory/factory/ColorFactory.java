package com.add.abstractFactory.factory;

import com.add.abstractFactory.*;

public class ColorFactory extends AbstractFactory{
    public Shape getShape(String shape) {
        return null;
    }

    public Color getColor(String color) {
        if (color == null) return null;
        else if (color.equals("red")) return new Red();
        else if (color.equals("blue")) return new Blue();
        return null;
    }
}
