package com.builderpattern.impls;

import com.builderpattern.apis.Item;
import com.builderpattern.apis.Packing;

/**
 * com.entity [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
