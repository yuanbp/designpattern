package com.observerpattern.impls;

import com.observerpattern.apis.Observer;

public class F_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(F_Observer.class.getName() + " : " + msg);
    }
}