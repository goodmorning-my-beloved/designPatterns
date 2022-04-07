package com.jkun.design.abstractAndImpl;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 9:25 2022/1/26 
 */
@Data
public abstract class MyAbstract {
    private String name = "55";
    public abstract void test();

    //  方法若被private修饰，则无法被继承
    public void say(HashMap map){
        System.out.println("父类say？");
    }
}
