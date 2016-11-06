package com.Labs.Tasks.Area_Task_2;

import java.util.ArrayList;

/**
 * Created by asus on 06.11.2016.
 */
public class ShadedArea {

    private ArrayList<Area> shadedArea;

    public ShadedArea(){
        shadedArea = new ArrayList<Area>();
        shadedArea.add(new Area(new Point(-4, 5), new Point(4, 0)));
        shadedArea.add(new Area(new Point(-6, 0), new Point(6, -3)));
    }

    public boolean inShadedArea(Point point){
        for(Area area: shadedArea){
            if (area.inArea(point))
                return true;
        }
        return false;
    }

}
