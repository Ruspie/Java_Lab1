package com.Labs.Tests;

import com.Labs.Tasks.IncreasingSequence_Task_8.SequencesCombiner;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by asus on 07.11.2016.
 */
public class SequencesCombinerTest {
    @Test
    public void getIndexInsertInSequence() throws Exception {
        List<Double> firstSequence = Arrays.asList(78.0, 100.0, 105.0);
        List<Double> secondSequence = Arrays.asList(76.0, 101.0, 105.0, 106.0, 106.0, 107.0);

        List<Integer> testList = Arrays.asList(0, 3, 4, 6, 7, 8);

        List<Integer> actualList = SequencesCombiner.getIndexInsertInSequence(firstSequence, secondSequence);

        Assert.assertEquals(testList, actualList);
    }
}