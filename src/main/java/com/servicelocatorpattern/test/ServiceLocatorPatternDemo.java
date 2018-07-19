package com.servicelocatorpattern.test;

import com.servicelocatorpattern.apis.Service;
import com.servicelocatorpattern.impls.ServiceLocator;

public class ServiceLocatorPatternDemo {
   public static void main(String[] args) {
      Service service = ServiceLocator.getService("Service1");
      service.execute();
      service = ServiceLocator.getService("Service2");
      service.execute();
      service = ServiceLocator.getService("Service1");
      service.execute();
      service = ServiceLocator.getService("Service2");
      service.execute();        
   }
}