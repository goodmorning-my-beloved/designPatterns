package com.jkun.design.建造者方法模式;

import java.util.ArrayList;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:19 2022/3/30 
 */
public class Client {


    public static void main(String[] args) {
//        Sniper sniper = new Sniper();
//        ArrayList<String> list = new ArrayList<>();
//        list.add("creep");
//        list.add("squat");
//        sniper.setSequence(list);
//        sniper.startTraning();

//        ArrayList<String> list = new ArrayList<>();
//        list.add("creep");
//        list.add("squat");
//        SniperBuilder sniperBuilder = new SniperBuilder();
//        sniperBuilder.setSequence(list);
//        AbstractSoldierTraning soldierTraningBuilder = sniperBuilder.getSoldierTraningBuilder();
//        soldierTraningBuilder.startTraning();
        Director director = new Director();
        AbstractSoldierTraning sniper = director.getSniper();
        sniper.startTraning();
    }
}
