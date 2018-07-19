package com.singletonpattern.test;

import com.singletonpattern.single.SelfSingle;

/**
 * com.test [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
//        SingleObject object = new SingleObject();

//        //获取唯一可用的对象
//        SingleObject object = SingleObject.getInstance();
//
//        //显示消息
//        object.showMessage();

        SelfSingle ss = SelfSingle.getSingleSelf();
        ss.saySome();
    }
}
