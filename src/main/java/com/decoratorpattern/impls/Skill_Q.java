package com.decoratorpattern.impls;

import com.decoratorpattern.apis.Hero;

/**
 * com.decoratorpattern.impls [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class Skill_Q extends Skills {

    private String skillName;

    public Skill_Q(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学会了Q技能："+skillName);
        super.learnSkills();
    }
}
