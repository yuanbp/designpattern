package com.visitorpattern.impls;

import com.visitorpattern.apis.ComputerPart;
import com.visitorpattern.apis.ComputerPartVisitor;

public class Mouse  implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}