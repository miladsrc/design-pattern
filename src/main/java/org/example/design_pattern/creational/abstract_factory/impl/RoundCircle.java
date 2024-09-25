package org.example.design_pattern.creational.abstract_factory.impl;

import org.example.design_pattern.creational.abstract_factory.Shape;

public class RoundCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("round_circle");
    }
}
