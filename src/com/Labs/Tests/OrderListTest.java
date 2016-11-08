package com.Labs.Tests;

import com.Labs.Tasks.InscreasingSequence_Task_5.OrderList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by asus on 09.11.2016.
 */
public class OrderListTest {
    @Test
    public void getNumberUnnecessaryElements() throws Exception {
        List<Integer> testArray = Arrays.asList(0, 4, 3, 11, 6, 10, 46, 13, 18, 25);

        OrderList orderList = new OrderList(testArray);
        int actualNumber = orderList.getNumberUnnecessaryElements();

        Assert.assertEquals(3, actualNumber);
    }

}