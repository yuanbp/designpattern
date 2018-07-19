package com.abstructfactorypattern.factory;


import com.abstructfactorypattern.apis.Color;
import com.abstructfactorypattern.apis.Shape;

/**
 * com.factory [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
