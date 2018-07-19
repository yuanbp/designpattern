package com.abstructfactorypattern.factory;

import com.abstructfactorypattern.apis.Color;
import com.abstructfactorypattern.apis.Shape;
import com.abstructfactorypattern.impls.Blue;
import com.abstructfactorypattern.impls.Green;
import com.abstructfactorypattern.impls.Red;

/**
 * com.factory [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
