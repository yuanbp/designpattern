package com.facedpattern.impls;

import com.facedpattern.apis.Shape;

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Square::draw()");
   }
}