package com.flyweightpattern.factory;

import java.util.HashMap;

import com.flyweightpattern.apis.Shape;
import com.flyweightpattern.impls.Circle;

public class ShapeFactory {
   private static final HashMap<String, Shape> circleMap = new HashMap<>();

   public static Shape getCircle(String color) {
      Circle circle = (Circle)circleMap.get(color);

      if(circle == null) {
         circle = new Circle(color);
         circleMap.put(color, circle);
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }
}