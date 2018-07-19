package com.factorypattern.factory;

import  com.factorypattern.apis.Shape;
import  com.factorypattern.impls.Circle;
import  com.factorypattern.impls.Rectangle;
import  com.factorypattern.impls.Square;

/**
 * com.factory [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
