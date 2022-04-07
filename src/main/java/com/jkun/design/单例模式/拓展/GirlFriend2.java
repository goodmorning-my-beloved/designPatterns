package com.jkun.design.单例模式.拓展;

import com.jkun.design.单例模式.饿汉.GirlFriend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: jkun
 * @Description:限定实例数量
 * @Date: Create in 14:08 2022/2/10 
 */
public class GirlFriend2 {

    private static int maxCount = 2;
    private static List<GirlFriend2> list = new ArrayList<>();
    private static Random random = new Random();

    static {
        GirlFriend2 girlFriend2 = new GirlFriend2();
        GirlFriend2 girlFriend22 = new GirlFriend2();
        list.add(girlFriend2);
        list.add(girlFriend22);
    }

    private GirlFriend2(){}

    public static GirlFriend2 getGirlFriend2(){
        return list.get(random.nextInt(maxCount));
    }

}
