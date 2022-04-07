package com.jkun.design.工厂方法模式.普通工厂方法模式多个工厂2;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:36 2022/2/10
 */
public class Client {


    public static void main(String[] args) {
        AbstractDrawFactory factory = new ModernistDrawFactory();
        AbstractDraw draw = factory.createDraw();
        draw.draw();
    }
}
