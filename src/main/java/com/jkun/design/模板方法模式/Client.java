package com.jkun.design.模板方法模式;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 15:14 2022/3/29 
 */
public class Client {

    public static void main(String[] args) {
        AbstractSoldierTraining artillery = new Artillery();
        artillery.start();

        Sniper sniper = new Sniper();
        sniper.setIngoreCreep(true);
        sniper.start();
    }

}
