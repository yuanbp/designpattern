package com.observerpattern.test;

import com.observerpattern.impls.F_Observer;
import com.observerpattern.impls.S_Observer;
import com.observerpattern.impls.Subject;
import com.observerpattern.impls.T_Observer;

public class Main {
    public static void main(String[] args) {        
        F_Observer fObserver = new F_Observer();
        S_Observer sObserver = new S_Observer();
        T_Observer tObserver = new T_Observer();
        Subject subject = new Subject();
        subject.addAttach(fObserver);        
        subject.addAttach(sObserver);        
        subject.addAttach(tObserver);                
        subject.setMsg("msg change");    
    }
}