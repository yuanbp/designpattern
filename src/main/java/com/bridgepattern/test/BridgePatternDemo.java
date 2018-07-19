package com.bridgepattern.test;

import com.bridgepattern.apis.Shape;
import com.bridgepattern.entity.Circle;
import com.bridgepattern.impls.GreenCircle;
import com.bridgepattern.impls.RedCircle;

/**
 * com.test [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10, new RedCircle());
        redCircle.draw();

        Shape greenCircle = new Circle(100,100,10, new GreenCircle());
        greenCircle.draw();
    }
}
