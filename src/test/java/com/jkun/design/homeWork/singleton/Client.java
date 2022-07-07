package com.jkun.design.homeWork.singleton;

import org.junit.jupiter.api.Test;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:59 2022/6/23
 */
public class Client {

    @Test
    public void testHungerSingleton () {
        HungerSingleton.getInstance();
    }

    @Test
    public void testLazySingleton () {
        LazySingleton.getInstance();
    }

    @Test
    public void testMultition () {
        Multiton instance = Multiton.getInstance();
        System.out.println(instance);
        Multiton instance2 = Multiton.getInstance();
        System.out.println(instance2);
    }



}
