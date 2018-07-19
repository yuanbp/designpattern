package com.abstructfactorypattern.impls;

import com.abstructfactorypattern.apis.Shape;

/**
 * com.impls [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
