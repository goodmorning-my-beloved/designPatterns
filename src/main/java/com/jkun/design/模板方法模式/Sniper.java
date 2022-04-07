package com.jkun.design.模板方法模式;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 15:12 2022/3/29 
 */
public class Sniper extends AbstractSoldierTraining {
    private String name = "狙击手";

    private boolean ingoreCreep;

    @Override
    protected void creep() {
        System.out.println(name+"匍匐前进");
    }

    @Override
    protected void squat() {
        System.out.println(name+"下蹲");
    }

    @Override
    protected void jump() {
        System.out.println(name+"跳跃");
    }

    @Override
    protected void shoot() {
        System.out.println(name+"开枪");
    }

    protected boolean ingoreCreep(){
        return this.ingoreCreep;
    }

    public void setIngoreCreep(boolean ingoreCreep) {
        this.ingoreCreep = ingoreCreep;
    }
}
