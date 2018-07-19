package com.servicelocatorpattern.impls;

import com.servicelocatorpattern.apis.Service;

public class Service2 implements Service {
   @Override
   public void execute(){
      System.out.println("Executing Service2");
   }

   @Override
   public String getName() {
      return "Service2";
   }
}