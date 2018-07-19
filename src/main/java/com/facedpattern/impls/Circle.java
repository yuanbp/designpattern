package com.facedpattern.impls;

import com.facedpattern.apis.Shape;

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Circle::draw()");
   }
}