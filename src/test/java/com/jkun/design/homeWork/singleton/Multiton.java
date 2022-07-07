package com.jkun.design.homeWork.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 15:04 2022/6/23
 */
public class Multiton {
    private static int maxMultition = 2;
    private static List<Multiton> multitonList = new ArrayList<>();

    static {
        for (int i = 0; i < maxMultition; i++) {
            multitonList.add(new Multiton());
        }
    }
    private Multiton(){
        System.out.println(this+"被实例");
    }

    public static Multiton getInstance(){
        System.out.println("获取实例");
        return multitonList.get((int)((10 * Math.random()) % 2));
    }
}
