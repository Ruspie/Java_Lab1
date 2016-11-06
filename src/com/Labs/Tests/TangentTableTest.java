package com.Labs.Tests;

import com.Labs.TangentTable.TangentTable;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by asus on 07.11.2016.
 */
public class TangentTableTest {
    @Test
    public void getTangentTable() throws Exception {
        TangentTable tangentTable = new TangentTable(0, 3, 1);
        Map<Double, Double> actualTable = tangentTable.getTangentTable();

        Map<Double, Double> testTable = new HashMap<>();
        testTable.put(0.0, 0.0);
        testTable.put(1.0, 1.5574077246549022305069748074584);
        testTable.put(2.0, -2.1850398632615189916433061023137);
        testTable.put(3.0, -0.14254654307427780529563541053391);

        Assert.assertEquals(actualTable, testTable);
    }

}