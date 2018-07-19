package com.decoratorpattern.impls;

import com.decoratorpattern.apis.Hero;

/**
 * com.decoratorpattern.impls [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class Skills implements Hero {

    //持有一个英雄对象接口
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        if(hero != null){
            hero.learnSkills();
        }
    }
}
