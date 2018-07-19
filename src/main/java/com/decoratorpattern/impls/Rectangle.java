package com.decoratorpattern.impls;

import com.decoratorpattern.apis.Shape;

/**
 * com.decoratorpattern.impls [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("shape: rectangle");
    }
}
