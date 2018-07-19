package com.singletonpattern.single;

/**
 * com.single [workset_idea_01]
 * Created by Richard on 2018/4/2
 *
 * @author Richard on 2018/4/2
 */
public class SingleObject {

//    //创建 SingleObject 的一个对象
//    private static SingleObject instance = new SingleObject();
//
//    //让构造函数为 private，这样该类就不会被实例化
//    private SingleObject(){}
//
//    //获取唯一可用的对象
//    public static SingleObject getInstance(){
//        return instance;
//    }
//
//    public void showMessage(){
//        System.out.println("Hello World!");
//    }

    private static class SingletonHolder {
        private static final SingleObject INSTANCE = new SingleObject();
    }

    private SingleObject (){}

    public static final SingleObject getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
