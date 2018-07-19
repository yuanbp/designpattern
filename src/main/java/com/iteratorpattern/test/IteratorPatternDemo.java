package com.iteratorpattern.test;

import com.iteratorpattern.apis.Iterator;
import com.iteratorpattern.impls.NameRepository;

public class IteratorPatternDemo {
    
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      }     
   }
}