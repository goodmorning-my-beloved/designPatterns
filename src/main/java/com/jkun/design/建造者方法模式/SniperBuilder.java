package com.jkun.design.建造者方法模式;

import java.util.ArrayList;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 21:02 2022/3/31 
 */
public class SniperBuilder extends AbstractSoldierTraningBuilder{

    private Sniper sniper = new Sniper();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.sniper.setSequence(sequence);
    }

    @Override
    public AbstractSoldierTraning getSoldierTraningBuilder() {
        return this.sniper;
    }
}
