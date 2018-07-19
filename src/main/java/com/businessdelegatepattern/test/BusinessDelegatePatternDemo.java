package com.businessdelegatepattern.test;

import com.businessdelegatepattern.impls.BusinessDelegate;
import com.businessdelegatepattern.impls.Client;

public class BusinessDelegatePatternDemo {
    
   public static void main(String[] args) {

      BusinessDelegate businessDelegate = new BusinessDelegate();
      businessDelegate.setServiceType("EJB");

      Client client = new Client(businessDelegate);
      client.doTask();

      businessDelegate.setServiceType("JMS");
      client.doTask();
   }
}