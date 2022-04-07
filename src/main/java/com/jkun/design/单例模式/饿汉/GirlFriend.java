package com.jkun.design.单例模式.饿汉;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 0:32 2022/2/9 
 */
public class GirlFriend {
    private static GirlFriend instance = new GirlFriend();

    private GirlFriend(){

    }

    public static GirlFriend getInstance(){
        return instance;
    }
}
