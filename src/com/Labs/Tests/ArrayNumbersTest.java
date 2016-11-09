package com.Labs.Tests;

import com.Labs.Tasks.ArrayOfPrime_Task_4.ArrayNumbers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by asus on 07.11.2016.
 */
public class ArrayNumbersTest {
    @Test
    public void getArrayPrimeNumbers() throws Exception {
        ArrayNumbers arrayNumbers = new ArrayNumbers(Arrays.asList(15, 26, 13, 2, 3, 5, 2, 4, 8, 2));
        List<Integer> actualIndex = arrayNumbers.getArrayIndexPrimeNumbers();

        List<Integer> testIndex = Arrays.asList(2, 3, 4, 5, 6, 9);

        Assert.assertEquals(testIndex, actualIndex);
    }
}