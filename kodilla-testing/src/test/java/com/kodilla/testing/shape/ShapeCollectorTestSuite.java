package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.io.ObjectInputStream;
import java.util.*;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite
{
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Testing ShapeCollector methods")
    class FigureTests
    {
        @Test
        void testAddFigure() {
            //Given
            Shape circle = new Circle("Circle");

            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(circle);
            //Then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveFigure() {
            //Given
            Shape triangle = new Triangle("Triangle");

            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(triangle);
            //When
            boolean result = shapeCollector.removeFigure(triangle);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.shapeList.size());
        }

        @Test
        void testGetFigure() {
            //Given
            Shape square = new Square("Square");

            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(square);
            //When
            Shape theShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(square, theShape);
        }
    }
}
