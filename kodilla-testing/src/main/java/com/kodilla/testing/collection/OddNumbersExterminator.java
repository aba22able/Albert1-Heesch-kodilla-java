package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator
{
    List<Integer> testingEvenList;

    public OddNumbersExterminator()
    {
        testingEvenList = new ArrayList<>();
    }

    public List<Integer> exterminate(List<Integer> numbers) {
            for(Integer number : numbers)
            {
                if(number % 2 == 0)
                {
                    testingEvenList.add(number);
                }
            }
            return testingEvenList;
    }

    public List<Integer> getTestingEvenList()
    {
        return testingEvenList;
    }
}
