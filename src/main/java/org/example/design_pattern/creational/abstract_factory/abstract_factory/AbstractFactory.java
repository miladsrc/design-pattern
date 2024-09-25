package org.example.design_pattern.creational.abstract_factory.abstract_factory;
import org.example.design_pattern.creational.abstract_factory.Shape;

public abstract class  AbstractFactory {

    public abstract Shape getShape(String type) throws Exception;

}
