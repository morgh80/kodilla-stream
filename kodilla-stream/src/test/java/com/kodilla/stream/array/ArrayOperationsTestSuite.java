package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void verifyIfGetsAverage() {

        //Given
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            int n = 1;
            numbers[i] = n+i;
        }

        //When
        Double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(5.5, result, 0.001);
    }

}
