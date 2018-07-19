package com.interceptingfilterpattern.impls;

import com.interceptingfilterpattern.apis.Filter;

public class DebugFilter implements Filter {
   @Override
   public void execute(String request){
      System.out.println("request log: " + request);
   }
}