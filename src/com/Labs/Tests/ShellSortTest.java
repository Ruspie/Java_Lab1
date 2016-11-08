package com.Labs.Tests;

import com.Labs.Tasks.ShellSort_Task_7.ShellSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by asus on 07.11.2016.
 */
public class ShellSortTest {
    @Test
    public void sort() throws Exception {
        List<Double> numbers = Arrays.asList(5.0, 3.0, 8.0, 0.0, 7.0, 4.0, 9.0, 1.0, 6.0, 2.0);
        List<Double> testList = Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);

        List<Double> actualList = ShellSort.Sort(numbers);

        Assert.assertEquals(testList, actualList);

    }
}