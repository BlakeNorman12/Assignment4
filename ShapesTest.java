package com.example.shapes;

import org.junit.*;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class ShapesTest {

    @Test
    public void testCalculateAreaRectangle() {
        Rectangle rectangle = new Rectangle(3, 4);

        double area = rectangle.calculateArea();
        double expectedArea = 12.0;

        assertEquals(expectedArea, area, 0);
    }
}
