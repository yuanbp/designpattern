package com.decoratorpattern.test;

import com.decoratorpattern.apis.Shape;
import com.decoratorpattern.impls.Circle;
import com.decoratorpattern.impls.Rectangle;
import com.decoratorpattern.impls.RedShapeDecorator;

/**
 * com.decoratorpattern.test [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
