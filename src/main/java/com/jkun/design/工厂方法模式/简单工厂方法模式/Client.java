package com.jkun.design.工厂方法模式.简单工厂方法模式;

/**
 * @Author: jkun
 * @Description:
 * 工厂不实现接口，主要考虑到不需要有额外的多个工厂
 * 缺点是不符合开闭原则，工厂扩展困难。
 * @Date: Create in 14:36 2022/2/10
 */
public class Client {


    public static void main(String[] args) {

        AbstractDraw draw = DrawFactory.createDraw(ModernistDraw.class);
        draw.draw();
    }
}
