package com.bridgepattern.entity;


import com.bridgepattern.apis.DrawAPI;
import com.bridgepattern.apis.Shape;

/**
 * com.apis [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int radius,int x,int y,DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
