package com.Labs.Tasks.ShellSort_Task_7;

import java.util.List;

/**
 * Created by asus on 07.11.2016.
 */
public final class ShellSort {

    public static List<Double> Sort(List<Double> numbers){

        List<Double> resultList = numbers;

        //List<Double> resultList = new ArrayList<>();
        //resultList.addAll(numbers);

        int size = resultList.size();
        int step = size / 2;
        while (step > 0){
            for(int i = 0; i < (size - step); i++){
                int j = i;
                while (j >= 0 && resultList.get(j) > resultList.get(j + step)){
                    double temp = resultList.get(j);
                    resultList.set(j, resultList.get(j + step));
                    resultList.set(j + step, temp);
                    j--;
                }
            }
            step = step / 2;
        }

        return resultList;
    }
}
