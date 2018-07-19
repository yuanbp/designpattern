package com.observerpattern.impls;

import com.observerpattern.apis.Observer;

public class S_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(S_Observer.class.getName() + " : " + msg);
    }
}