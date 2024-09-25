package org.example.design_pattern.creational.abstract_factory.factory;

import org.example.design_pattern.creational.abstract_factory.Shape;
import org.example.design_pattern.creational.abstract_factory.abstract_factory.AbstractFactory;
import org.example.design_pattern.creational.abstract_factory.impl.RoundCircle;
import org.example.design_pattern.creational.abstract_factory.impl.RoundRectangle;

public class RoundShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String type) throws Exception {
        Shape shape ;
        switch (type.toLowerCase()) {
            case "roundrectangle":shape = new RoundRectangle(); break;
            case "roundcircle":shape = new RoundCircle(); break;
            default:
                throw new Exception("Unknown type");
        }
        return shape;
    }
}
