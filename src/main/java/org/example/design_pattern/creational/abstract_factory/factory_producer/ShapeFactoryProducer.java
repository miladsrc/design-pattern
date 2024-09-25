package org.example.design_pattern.creational.abstract_factory.factory_producer;
import org.example.design_pattern.creational.abstract_factory.abstract_factory.AbstractFactory;
import org.example.design_pattern.creational.abstract_factory.factory.RoundShapeFactory;
import org.example.design_pattern.creational.abstract_factory.factory.ShapeFactory;

public class ShapeFactoryProducer {

    public AbstractFactory getFactory(Boolean rounded){
        return (rounded)? new RoundShapeFactory(): new ShapeFactory();
    }
}
