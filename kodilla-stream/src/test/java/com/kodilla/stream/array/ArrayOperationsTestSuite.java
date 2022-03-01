package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite
{
    @Test
    public void testGetAverage()
    {
        //Given
        int numbers[] = new int [20];
        numbers[0] = 5;
        numbers[1] = 7;
        numbers[2] = 8;
        numbers[3] = 0;
        numbers[4] = 12;
        numbers[5] = 1;
        numbers[6] = 17;
        numbers[7] = 82;
        numbers[8] = 40;
        numbers[9] = 2;
        numbers[10] = 58;
        numbers[11] = 32;
        numbers[12] = 18;
        numbers[13] = 2;
        numbers[14] = 1;
        numbers[15] = 54;
        numbers[16] = 7;
        numbers[17] = 83;
        numbers[18] = 10;
        numbers[19] = 123;

        //When
        double averageResult = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(28.1,averageResult);
    }
}
