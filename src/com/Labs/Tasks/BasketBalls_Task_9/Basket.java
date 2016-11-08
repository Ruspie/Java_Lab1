package com.Labs.Tasks.BasketBalls_Task_9;

import java.awt.*;
import java.util.List;

/**
 * Created by asus on 08.11.2016.
 */
public class Basket {
    private List<Ball> balls;

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public double getBallsWeight() {
        double resultWeight = 0.0;
        for(Ball ball: balls){
            resultWeight += ball.getWeight();
        }
        return resultWeight;
    }

    public int getNumberColoredBalls(Color color){
        int resultNumber = 0;
        for(Ball ball: balls){
            if (ball.getColor() == color){
                resultNumber++;
            }
        }
        return resultNumber;
    }
}
