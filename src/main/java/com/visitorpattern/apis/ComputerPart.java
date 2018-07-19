package com.visitorpattern.apis;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}