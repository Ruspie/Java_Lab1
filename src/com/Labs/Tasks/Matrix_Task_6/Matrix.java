package com.Labs.Tasks.Matrix_Task_6;

import static java.lang.System.arraycopy;

/**
 * Created by asus on 07.11.2016.
 */
public class Matrix {
    private double[][] matrix;

    public Matrix(double[] numbers){
        matrix = new double[numbers.length][numbers.length];
        generateMatrix(numbers);
    }

    private void generateMatrix(double[] numbers){
        for(int i = 0; i < matrix.length; i++){
            arraycopy(numbers, i, matrix[i], 0, matrix.length - i);
            arraycopy(numbers, 0, matrix[i], matrix.length - i, i);
        }
    }

    public double[][] getMatrix(){
        return matrix;
    }

}
