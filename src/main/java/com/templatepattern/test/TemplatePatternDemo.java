package com.templatepattern.test;

import com.templatepattern.apis.Game;
import com.templatepattern.impls.Cricket;
import com.templatepattern.impls.Football;

public class TemplatePatternDemo {
   public static void main(String[] args) {

      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();        
   }
}