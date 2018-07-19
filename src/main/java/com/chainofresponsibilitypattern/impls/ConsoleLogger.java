package com.chainofresponsibilitypattern.impls;

import com.chainofresponsibilitypattern.apis.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

   public ConsoleLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {        
      System.out.println("Standard Console::Logger: " + message);
   }
}