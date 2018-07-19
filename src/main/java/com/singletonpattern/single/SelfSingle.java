package com.singletonpattern.single;

/**
 * com.single [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 * 登记式 / 静态内部类单例模式
 */
public class SelfSingle {

    private SelfSingle(){}

    private static class SelfSingleHolder {
        public static final SelfSingle INSTANCE = new SelfSingle();
    }

    public static SelfSingle getSingleSelf(){
        return SelfSingleHolder.INSTANCE;
    }

    public void saySome(){
        System.out.println("Hello");
    }
}
