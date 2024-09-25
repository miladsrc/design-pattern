package org.example.design_pattern.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");

        shape.draw();
    }
}
