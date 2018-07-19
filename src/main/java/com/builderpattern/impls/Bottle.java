package com.builderpattern.impls;

import com.builderpattern.apis.Packing;

/**
 * com.apis [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
