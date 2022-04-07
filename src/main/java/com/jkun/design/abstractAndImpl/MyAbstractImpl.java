package com.jkun.design.abstractAndImpl;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: jkun
 * @Description: 子类必须实现抽象方法，
 * @Date: Create in 9:30 2022/1/26 
 */
@Data
public class MyAbstractImpl extends MyAbstract {
    private String name;
    @Override
    public void test() {

    }

    public void say(Map map){
        System.out.println("子类say？");
    }
}
