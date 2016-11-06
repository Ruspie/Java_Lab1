package com.Labs.Tests;


import com.Labs.Tasks.Expression_Task_1.Expression;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by asus on 08.09.2016.
 */
public class ExpressionTest {

    @Test
    public void getResult() throws Exception {
        Assert.assertEquals(new Expression(-1, 1).getResult(), -0.5, 0.0000001);
        Assert.assertEquals(new Expression(1, -1).getResult(), 1.5, 0.0000001);
        Assert.assertEquals(new Expression(0, 0).getResult(), 0.5, 0.0000001);
    }
}