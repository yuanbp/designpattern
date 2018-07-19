package com.businessdelegatepattern.impls;

import com.businessdelegatepattern.apis.BusinessService;

public class EJBService implements BusinessService {

   @Override
   public void doProcessing() {
      System.out.println("Processing task by invoking EJB Service");
   }
}