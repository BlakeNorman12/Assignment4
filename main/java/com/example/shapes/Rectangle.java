package com.example.shapes;

public class Rectangle extends Shapes{

    public Rectangle(double base, double height) {
        super(base, height, 0.0);
    }
    public double calculateArea() {
        return base * height;
    }
}
