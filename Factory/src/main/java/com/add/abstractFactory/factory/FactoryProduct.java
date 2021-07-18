package com.add.abstractFactory.factory;


public class FactoryProduct {
    public AbstractFactory getFactory(String product){
        if (product == null) return null;
        else if (product.equals("color")) return new ColorFactory();
        else if (product.equals("shape")) return new ShapeFactory();
        return null;
    }
}
