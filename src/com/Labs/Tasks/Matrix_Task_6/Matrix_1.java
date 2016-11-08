package com.Labs.Tasks.Matrix_Task_6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 07.11.2016.
 */
public class Matrix_1 {
    private List<List<Double>> matrix;

    public Matrix_1(List<Double> numbers){
        matrix = new ArrayList<>();
        generateMatrix(numbers);
    }

    private void generateMatrix(List<Double> numbers){
        for(int i = 0; i < numbers.size(); i++){
            List<Double> tempList = new ArrayList<>();
            tempList.addAll(numbers.subList(i, numbers.size()));
            tempList.addAll(numbers.subList(0, i));
            matrix.add(tempList);
        }
    }

    public List<List<Double>> getMatrix(){
        return matrix;
    }
}
