package com.Labs.Tasks.BasketBalls_Task_9;

import java.awt.*;

/**
 * Created by asus on 08.11.2016.
 */
public class Ball {
    private Color color;
    private double weight;

    public Ball(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
}
