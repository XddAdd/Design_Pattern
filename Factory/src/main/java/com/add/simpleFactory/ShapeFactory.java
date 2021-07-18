package com.add.simpleFactory;

public class ShapeFactory {

    Shape getShape(String shape){
        if (shape == null) return null;
        else if (shape.equals("circle")) return new Circle();
        else if (shape.equals("square")) return new Square();
        return null;
    }
}
