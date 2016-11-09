package com.Labs.Tests;

import com.Labs.Tasks.TangentTable_Task_3.TangentTable;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by asus on 07.11.2016.
 */
public class TangentTableTest {
    @Test
    public void getTangentTable() throws Exception {
        TangentTable tangentTable = new TangentTable(0, 3, 1);
        Map<Double, Double> actualTable = tangentTable.getTangentTable();

        Map<Double, Double> testTable = new TreeMap<>();
        testTable.put(0.0, 0.0);
        testTable.put(1.0, 1.5574077246549022305069748074584);
        testTable.put(2.0, -2.1850398632615189916433061023137);
        testTable.put(3.0, -0.14254654307427780529563541053391);

        Assert.assertEquals(testTable, actualTable);
    }

}