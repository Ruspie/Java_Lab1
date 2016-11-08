package com.Labs.Tasks.IncreasingSequence_Task_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 07.11.2016.
 */
public final class SequencesCombiner {
    public static List<Integer> getIndexInsertInSequence(List<Double> destList, List<Double> srcList){

        List<Integer> resultIndexList = new ArrayList<>();
        List<Double> resultSequence = new ArrayList<>();
        resultSequence.addAll(destList);

        int index = 0;
        for(int i = 0; i < srcList.size(); i++){
            if (destList.get(destList.size() - 1) >= srcList.get(i)){
                while(resultSequence.get(index) < srcList.get(i))
                    index++;
                resultIndexList.add(index);
                resultSequence.add(index, srcList.get(i));
                index++;
            }
            else{
                index++;
                resultIndexList.add(index);
                resultSequence.add(srcList.get(i));
            }
        }
        return resultIndexList;
    }
}