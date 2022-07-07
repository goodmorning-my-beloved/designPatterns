package com.jkun.design.homeWork.singleton;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 15:00 2022/6/23
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){
        System.out.println(this.getClass()+"被实例化");
    }

    public static synchronized LazySingleton getInstance(){
        System.out.println("获取实例");
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
