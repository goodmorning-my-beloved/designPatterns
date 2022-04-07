package com.jkun.design.工厂方法模式.普通工厂方法模式实现单例;

import java.lang.reflect.Constructor;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 16:09 2022/2/10 
 */
public class SingletonFactory {

    private static Singleton singleton = null;

    static {
        try {
            //  反射创建对象
            //  ps：使用newInstance要求该类有默认的公共无参构造器
//            singleton = Singleton.class.newInstance();
            Class<Singleton> singletonClass = Singleton.class;
            Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            singleton = declaredConstructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
