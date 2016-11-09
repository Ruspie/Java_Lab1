package com.Labs.Tasks.ArrayOfPrime_Task_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 07.11.2016.
 */
public class ArrayNumbers {

    private List<Integer> numbers;

    public ArrayNumbers(List<Integer> numbers){
        this.numbers = numbers;
    }

    public List<Integer> getArrayIndexPrimeNumbers(){
        List<Integer> listIndexPrimeNumber = new ArrayList<>();
        int index = 0;
        for(int number: numbers){
            if (isPrime(number)){
                listIndexPrimeNumber.add(index);
            }
            index++;
        }
        return listIndexPrimeNumber;
    }

    private boolean isPrime(int number){
        int divider = 2;
        while ((divider * divider <= number) && (number % divider != 0)){
            divider++;
        }
        return divider * divider > number;
    }
}
