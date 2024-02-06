package com.example.shapes;

public abstract class Shapes {

    public double base;
    public double height;
    public double radius;

    public Shapes(double base, double height, double radius) {
        this.base = base;
        this.height = height;
        this.radius = radius;
    }
    public abstract double calculateArea();
}
