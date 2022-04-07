package com.jkun.design.建造者方法模式;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:18 2022/3/30 
 */
public class Sniper extends AbstractSoldierTraning {
    @Override
    protected void creep() {
        System.out.println("匍匐");
    }

    @Override
    protected void squat() {
        System.out.println("下蹲");

    }

    @Override
    protected void jump() {
        System.out.println("跳跃");

    }

    @Override
    protected void shoot() {
        System.out.println("开枪");

    }
}
