package com.interceptingfilterpattern.impls;

import com.interceptingfilterpattern.apis.Filter;

public class AuthenticationFilter implements Filter {
   @Override
   public void execute(String request){
      System.out.println("Authenticating request: " + request);
   }
}