package com.jkun.design.建造者方法模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:13 2022/3/30 
 */
public abstract class AbstractSoldierTraning {

    private List<String> sequence = new ArrayList();

    protected abstract void creep();

    protected abstract void squat();

    protected abstract void jump();

    protected abstract void shoot();

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

    public void startTraning() {
        for (String step : sequence) {
            if ("creep".equals(step)) {
                this.creep();
            } else if ("squat".equals(step)) {
                this.squat();
            } else if ("jump".equals(step)) {
                this.jump();
            } else if ("shoot".equals(step)) {
                this.shoot();
            }
        }
    }

}
