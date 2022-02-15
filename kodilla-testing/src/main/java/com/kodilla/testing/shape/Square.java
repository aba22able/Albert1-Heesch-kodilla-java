package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;

    public Square(String shapeName)
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
