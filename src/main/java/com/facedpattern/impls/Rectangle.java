package com.facedpattern.impls;

import com.facedpattern.apis.Shape;

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }
}