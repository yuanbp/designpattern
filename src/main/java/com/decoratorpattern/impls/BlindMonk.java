package com.decoratorpattern.impls;

import com.decoratorpattern.apis.Hero;

/**
 * com.decoratorpattern.impls [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class BlindMonk implements Hero {

    private String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + " 学会了以上技能！");
    }
}
