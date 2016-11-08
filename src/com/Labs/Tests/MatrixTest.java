package com.Labs.Tests;

import com.Labs.Tasks.Matrix_Task_6.Matrix;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by asus on 07.11.2016.
 */
public class MatrixTest {
    @Test
    public void getMatrix() throws Exception {
        double[] number = {1.0, 2.0, 3.0, 4.0};
        double[][] testMatrix = {
                {1.0, 2.0, 3.0, 4.0},
                {2.0, 3.0, 4.0, 1.0},
                {3.0, 4.0, 1.0, 2.0},
                {4.0, 1.0, 2.0, 3.0}
        };

        Matrix matrix = new Matrix(number);
        double[][] actualMatrix = matrix.getMatrix();

        Assert.assertArrayEquals(testMatrix, actualMatrix);
    }

}