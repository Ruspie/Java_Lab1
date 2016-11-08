package com.Labs.Tests;

import com.Labs.Tasks.Matrix_Task_6.Matrix;
import com.Labs.Tasks.Matrix_Task_6.Matrix_1;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by asus on 07.11.2016.
 */
public class Matrix_1Test {
    @Test
    public void getMatrix() throws Exception {
        List<Double> number = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        List<List<Double>> testMatrix = Arrays.asList(
                Arrays.asList(1.0, 2.0, 3.0, 4.0),
                Arrays.asList(2.0, 3.0, 4.0, 1.0),
                Arrays.asList(3.0, 4.0, 1.0, 2.0),
                Arrays.asList(4.0, 1.0, 2.0, 3.0)
        );

        Matrix_1 matrix = new Matrix_1(number);
        List<List<Double>> actualMatrix = matrix.getMatrix();

        Assert.assertEquals(testMatrix, actualMatrix);
    }

}