package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector
{
    List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape)
    {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape)
    {
        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n)
    {
        return shapeList.get(n);
    }


    public void showFigures()
    {
        System.out.println(shapeList);
    }
}
