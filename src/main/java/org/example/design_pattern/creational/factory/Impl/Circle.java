package org.example.design_pattern.creational.factory.Impl;

import org.example.design_pattern.creational.factory.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

