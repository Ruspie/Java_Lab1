package com.Labs.Tasks.InscreasingSequence_Task_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 09.11.2016.
 */
public class OrderList {
    private List<Integer> list;

    public OrderList(List<Integer> list){
        list = new ArrayList<>();
        list.addAll(list);
    }

    public int getNumberUnnecessaryElements(){
        List<Integer> lengthPossibleSequence = getInitilizedList(list.size());
        int maxSequenceLength = getMax(getCountOptimizedSequence(lengthPossibleSequence));
        return list.size() - maxSequenceLength;
    }

    private List<Integer> getInitilizedList(int length){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < length; i++){
            list.add(1);
        }
        return list;
    }

    private List<Integer> getCountOptimizedSequence(List<Integer> sequence){
        for (int i = 0; i < this.list.size(); i++){
            for (int j = 0; j < i; j++){
                if ((this.list.get(i) > this.list.get(j)) && (sequence.get(i) < sequence.get(j) + 1)){
                    sequence.set(i,sequence.get(j) + 1);
                }
            }
        }
        return sequence;
    }

    private int getMax(List<Integer> array){
        int max = 0;
        for(int element: array){
            if (element > max){
                max = element;
            }
        }
        return max;
    }
}
