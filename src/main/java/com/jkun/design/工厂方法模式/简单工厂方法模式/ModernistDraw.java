package com.jkun.design.工厂方法模式.简单工厂方法模式;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:17 2022/2/10 
 */
public class ModernistDraw extends AbstractDraw {


    @Override
    public void draw() {
        System.out.println(super.getName()+"现实主义画画");
    }
}
