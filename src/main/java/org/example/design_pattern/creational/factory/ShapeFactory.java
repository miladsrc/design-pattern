package org.example.design_pattern.creational.factory;

import org.example.design_pattern.creational.factory.Impl.Circle;
import org.example.design_pattern.creational.factory.Impl.Rectangle;
import org.example.design_pattern.creational.factory.Impl.Square;

public class ShapeFactory {


    Shape shape;
    public Shape getShape(String type) throws Exception {
        switch (type.toLowerCase()) {
            case "rectangle": shape = new Rectangle(); break;
            case "circle": shape = new Circle(); break;
            case "square": shape = new Square(); break;
            default:
                throw new Exception("Invalid type: " + type);
        }
        return shape;
    }
}
