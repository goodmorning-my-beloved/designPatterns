package com.jkun.design.单例模式.懒汉;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 11:57 2022/2/10 
 */
public class LazyGirlFriend {

    private static LazyGirlFriend lazyGirlFriend = null;


    private LazyGirlFriend(){}

    //  调用时再生成实例，这种单例被称为懒汉模式
    public static synchronized LazyGirlFriend getLazyGirlFriend() {
        if (lazyGirlFriend == null) {
            return new LazyGirlFriend();
        }
        return lazyGirlFriend;
    }

}
