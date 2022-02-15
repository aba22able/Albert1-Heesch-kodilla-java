package com.kodilla.testing.shape;

public class Circle implements Shape{
    private String shapeName;

    public Circle(String shapeName)
    {
        this.shapeName = shapeName;
    }


    public String getShapeName() {
        return shapeName;
    }


    public double getField() {
        return 0;
    }
}
