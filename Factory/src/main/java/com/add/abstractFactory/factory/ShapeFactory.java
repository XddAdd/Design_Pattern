package com.add.abstractFactory.factory;

import com.add.abstractFactory.Circle;
import com.add.abstractFactory.Color;
import com.add.abstractFactory.Shape;
import com.add.abstractFactory.Square;


public class ShapeFactory extends AbstractFactory{

    public Shape getShape(String shape) {
        if (shape == null) return null;
        else if (shape.equals("circle")) return new Circle();
        else if (shape.equals("square")) return new Square();
        return null;
    }

    public Color getColor(String color) {
        return null;
    }
}
