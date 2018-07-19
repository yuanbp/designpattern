package com.bridgepattern.apis;

/**
 * com.entity [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public abstract class Shape {

    public DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
