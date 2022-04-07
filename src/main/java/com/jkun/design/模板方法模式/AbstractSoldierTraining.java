package com.jkun.design.模板方法模式;

import java.util.TreeMap;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 15:08 2022/3/29 
 */
public abstract class AbstractSoldierTraining {

    protected abstract void creep();

    protected abstract void squat();

    protected abstract void jump();

    protected abstract void shoot();

    public final void start() {
        if (!ingoreCreep()) {
            creep();
        }
        squat();
        jump();
        shoot();
    }


    protected boolean ingoreCreep(){
       return false;
    }
}
