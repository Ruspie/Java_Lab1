package com.Labs.Tests;

import com.Labs.Area_Task_2.Area;
import com.Labs.Area_Task_2.Point;
import com.Labs.Area_Task_2.ShadedArea;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by asus on 06.11.2016.
 */
public class ShadedAreaTest {
    @Test
    public void inArea() throws Exception {
        Area area = new Area(new Point(10, 10), new Point(20, 5));
        Assert.assertEquals(area.inArea(new Point(12, 8)), true);
    }

    @Test
    public void inTopArea() throws Exception {
        ShadedArea shadedArea = new ShadedArea();
        Assert.assertEquals(shadedArea.inShadedArea(new Point(0, 2)), true);
    }

    @Test
    public void inBottomArea() throws Exception {
        ShadedArea shadedArea = new ShadedArea();
        Assert.assertEquals(shadedArea.inShadedArea(new Point(0, -2)), true);
    }

    @Test
    public void onBorderAreas() throws Exception {
        ShadedArea shadedArea = new ShadedArea();
        Assert.assertEquals(shadedArea.inShadedArea(new Point(0, 0)), true);
    }

    @Test
    public void inBorderTopArea() throws Exception {
        ShadedArea shadedArea = new ShadedArea();
        Assert.assertEquals(shadedArea.inShadedArea(new Point(-2, 5)), true);
    }

    @Test
    public void inBorderBottomArea() throws Exception {
        ShadedArea shadedArea = new ShadedArea();
        Assert.assertEquals(shadedArea.inShadedArea(new Point(-6, -2)), true);
    }

}