package com.jkun.design.abstractAndImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 9:31 2022/1/26 
 */
public class MainTest {

    /*
    * 抽象类可以有成员属性，
    * 抽象类不能被实例化，但可以有成员属性。
    * 抽象类不能被实现，但可以被继承，会约束子类必须覆写其抽象类方法
    * 实现类的成员属性若与父类相同，则执行对应的get方法和set方法时，
    * 本质上是执行子类的覆写get、set方法。
    *
    *
    * abstract 本质仍然是用于被继承，方便重用。interface本质是用于固化模块契约，降低耦合
    * */
    public static void main(String[] args) {

        MyAbstract myAbstract = new MyAbstractImpl();
        System.out.println(myAbstract.getName());
        System.out.println(myAbstract.getName());
//        myAbstract.test();
//        Map hashMap = new HashMap();
//        myAbstract.say(hashMap);
    }
}
