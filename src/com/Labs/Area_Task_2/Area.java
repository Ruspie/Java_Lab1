package com.Labs.Area_Task_2;

/**
 * Created by asus on 06.11.2016.
 */
public class Area {

    private Point firstPoint;
    private Point secondPoint;

    public Area(Point firstPoint, Point secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public boolean inArea(Point point){
        return ( (point.getX() >= firstPoint.getX()) && (point.getX() <= secondPoint.getX()) && (point.getY() <= firstPoint.getY()) && (point.getY() >= (secondPoint.getY())) );
    }
}
