package com.visitorpattern.test;

import com.visitorpattern.apis.ComputerPart;
import com.visitorpattern.impls.Computer;
import com.visitorpattern.impls.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
   public static void main(String[] args) {

      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}