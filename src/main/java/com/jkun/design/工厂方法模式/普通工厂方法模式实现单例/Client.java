package com.jkun.design.工厂方法模式.普通工厂方法模式实现单例;

import java.security.SignatureException;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 16:15 2022/2/10 
 */
public class Client {

    public static void main(String[] args) {
        Singleton singleton = SingletonFactory.getSingleton();
        System.out.println(singleton);
    }
}
