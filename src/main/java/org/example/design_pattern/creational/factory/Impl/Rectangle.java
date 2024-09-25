package org.example.design_pattern.creational.factory.Impl;

import org.example.design_pattern.creational.factory.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
