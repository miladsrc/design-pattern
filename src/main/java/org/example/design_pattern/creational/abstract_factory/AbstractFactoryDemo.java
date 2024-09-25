package org.example.design_pattern.creational.abstract_factory;

import org.example.design_pattern.creational.abstract_factory.abstract_factory.AbstractFactory;
import org.example.design_pattern.creational.abstract_factory.factory_producer.ShapeFactoryProducer;

public class AbstractFactoryDemo {

    public static void main(String[] args) throws Exception {

        ShapeFactoryProducer shapeFactoryProducer = new ShapeFactoryProducer();
        AbstractFactory abstractFactory = shapeFactoryProducer.getFactory(false);
        Shape shape = abstractFactory.getShape("circle");
        shape.draw();

    }
}
