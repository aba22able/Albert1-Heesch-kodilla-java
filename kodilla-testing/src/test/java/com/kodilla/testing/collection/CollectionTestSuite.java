package com.kodilla.testing.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CollectionTestSuite
{
    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @BeforeEach
    public void before()
    {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after()
    {
        System.out.println("Test Case: end");
    }

    @DisplayName("when the list is empty, " +
            "then emptyList should equal testingList"
    )
    @Test
    public void testOddNumbersExterminatorEmptyList()
    {
        //Given
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> testingList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("The list is empty");

        //Then
        Assertions.assertEquals(emptyList, testingList);
    }
    @DisplayName("when we pick only even numbers, " +
            "then regularList should not be equal to testingEvenList"
    )
    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        //Given
        List<Integer> regularList = new ArrayList<>();

        regularList.add(5);
        regularList.add(3);
        regularList.add(1);
        regularList.add(2);
        regularList.add(6);
        regularList.add(7);
        regularList.add(9);
        regularList.add(2);
        regularList.add(5);

        //When
        List<Integer> testingEvenList = oddNumbersExterminator.exterminate(regularList);
        System.out.println("testingList is filled with even numbers");

        //Then
        Assertions.assertNotEquals(regularList, testingEvenList);
    }
}
