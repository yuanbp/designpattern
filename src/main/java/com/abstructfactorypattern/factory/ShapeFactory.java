package com.abstructfactorypattern.factory;

import com.abstructfactorypattern.apis.Color;
import com.abstructfactorypattern.apis.Shape;
import com.abstructfactorypattern.impls.Circle;
import com.abstructfactorypattern.impls.Rectangle;
import com.abstructfactorypattern.impls.Square;

/**
 * com.factory [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
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

    @Override
    public Color getColor(String color) {
        return null;
    }
}
