package com.jkun.design.建造者方法模式;

import java.util.ArrayList;

/**
 * @Author: jkun
 * @Description:导演类
 * @Date: Create in 21:59 2022/3/31 
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<>();
    private SniperBuilder sniperBuilder = new SniperBuilder();

    public AbstractSoldierTraning getSniper() {
        this.sequence.clear();
        sequence.add("creep");
        sequence.add("squat");
        this.sniperBuilder.setSequence(sequence);

        return this.sniperBuilder.getSoldierTraningBuilder();
    }
}
