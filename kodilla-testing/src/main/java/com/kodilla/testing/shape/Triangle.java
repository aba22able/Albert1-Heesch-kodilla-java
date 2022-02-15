package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String shapeName;

    public Triangle(String shapeName)
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
