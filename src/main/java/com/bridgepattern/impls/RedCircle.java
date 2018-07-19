package com.bridgepattern.impls;

import com.bridgepattern.apis.DrawAPI;

/**
 * com.impls [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw circle [color: red, radius:"+radius+", x:"+x+", y:"+y+"]");
    }
}
