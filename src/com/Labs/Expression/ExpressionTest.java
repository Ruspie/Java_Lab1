package com.Labs.Expression;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by asus on 08.09.2016.
 */
public class ExpressionTest {
    @Test
    public void getResult() throws Exception {
        Assert.assertEquals(new Expression(-1, 1).getResult(), -0.5, 0.0000001);
    }
}