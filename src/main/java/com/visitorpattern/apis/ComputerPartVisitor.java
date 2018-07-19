package com.visitorpattern.apis;

import com.visitorpattern.impls.Computer;
import com.visitorpattern.impls.Keyboard;
import com.visitorpattern.impls.Monitor;
import com.visitorpattern.impls.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}