package com.Labs.Expression_Task_1;

/**
 * Created by asus on 08.09.2016.
 */
public class Expression {
    private double x;
    private double y;

    public Expression(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getResult(){
       return getNumerator()/getDenumerator() + x;
    }

    private double getNumerator(){
        return 1 + Math.pow(Math.sin(x + y), 2);
    }

    private double getDenumerator(){
        return 2 + Math.abs(x - (2 * x)/(1 + Math.pow(x * y, 2)));
    }
}
