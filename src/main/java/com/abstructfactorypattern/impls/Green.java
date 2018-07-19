package com.abstructfactorypattern.impls;

import com.abstructfactorypattern.apis.Color;

/**
 * com.impls [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
