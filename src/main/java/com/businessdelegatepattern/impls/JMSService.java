package com.businessdelegatepattern.impls;

import com.businessdelegatepattern.apis.BusinessService;

public class JMSService implements BusinessService {

   @Override
   public void doProcessing() {
      System.out.println("Processing task by invoking JMS Service");
   }
}