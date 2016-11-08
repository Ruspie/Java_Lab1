package com.Labs.Tests;

import com.Labs.Tasks.BasketBalls_Task_9.Ball;
import com.Labs.Tasks.BasketBalls_Task_9.Basket;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by asus on 08.11.2016.
 */
public class BasketTest {
    @Test
    public void getBalls() throws Exception {
        List<Ball> testBalls = Arrays.asList(new Ball(Color.black, 5.0), new Ball(Color.blue, 2.2));
        Basket basket = new Basket(testBalls);

        List<Ball> actualBalls = basket.getBalls();

        Assert.assertEquals(testBalls, actualBalls);
    }

    @Test
    public void getBallsWeight() throws Exception {
        List<Ball> testBalls = Arrays.asList(new Ball(Color.black, 5.0), new Ball(Color.blue, 2.2));
        Basket basket = new Basket(testBalls);

        double testWeight = 7.2;

        double actualWeight = basket.getBallsWeight();

        Assert.assertEquals(testWeight, actualWeight, 0.00000001);
    }

    @Test
    public void getNumberColoredBalls() throws Exception {
        List<Ball> testBalls = Arrays.asList(new Ball(Color.black, 5.0), new Ball(Color.blue, 2.2), new Ball(Color.blue, 1.0));
        Basket basket = new Basket(testBalls);

        int testNumberColoredBalls = 2;

        int actualNumberColoredBalls = basket.getNumberColoredBalls(Color.blue);

        Assert.assertEquals(testNumberColoredBalls, actualNumberColoredBalls);
    }

}