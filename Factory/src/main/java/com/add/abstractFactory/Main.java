package com.add.abstractFactory;

import com.add.abstractFactory.factory.AbstractFactory;
import com.add.abstractFactory.factory.FactoryProduct;

public class Main {

    public static void main(String[] args) {
        //超级工厂
        FactoryProduct factoryProduct = new FactoryProduct();

        //超级工厂的子工厂-shape
        AbstractFactory shapeFactory = factoryProduct.getFactory("shape");
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        //超级工厂的子工厂-color
        AbstractFactory colorFactory = factoryProduct.getFactory("color");
        Color color1 = colorFactory.getColor("red");
        color1.fill();
        Color color2 = colorFactory.getColor("blue");
        color2.fill();



    }
}
