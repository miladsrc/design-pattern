package org.example.design_pattern.creational.abstract_factory.impl;

import org.example.design_pattern.creational.abstract_factory.Shape;

public class RoundRectangle implements Shape {


    @Override
    public void draw() {
        System.out.println("RoundRectangle");
    }
}
