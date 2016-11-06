package com.Labs.TangentTable;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by asus on 06.11.2016.
 */
public class TangentTable {

    private Map<Double, Double> tangentTable;

    public TangentTable(double leftBorder, double rightBorder, double step){
        tangentTable = new HashMap<>();
        fillingTangentTable(leftBorder, rightBorder, step);
    }

    private void fillingTangentTable(double leftBorder, double rightBorder, double step){
        for(double i = leftBorder; i <= rightBorder; i += step){
            tangentTable.put(i, Math.tan(i));
        }
    }

    public Map<Double, Double> getTangentTable(){
        return tangentTable;
    }

}
