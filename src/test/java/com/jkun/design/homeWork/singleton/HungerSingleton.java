package com.jkun.design.homeWork.singleton;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:56 2022/6/23
 */
public class HungerSingleton {

    private static HungerSingleton hungerSingleton = new HungerSingleton();

    private HungerSingleton(){
        System.out.println(this.getClass()+"被实例化");
    }

    public static HungerSingleton getInstance(){
        System.out.println("获取实例");
        return hungerSingleton;
    }

}
