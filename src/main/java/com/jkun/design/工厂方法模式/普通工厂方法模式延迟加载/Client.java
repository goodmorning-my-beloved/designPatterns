package com.jkun.design.工厂方法模式.普通工厂方法模式延迟加载;

/**
 * @Author: jkun
 * @Description: 见DrawFactory描述
 * @Date: Create in 14:36 2022/2/10
 */
public class Client {


    public static void main(String[] args) {
        AbstractDrawFactory factory = new DrawFactory();//  业务需要必要的对细节的依赖

        AbstractDraw draw = factory.createDraw(ModernistDraw.class);//这一句的入参符合里氏替换
        draw.setName("大红");
        AbstractDraw draw2 = factory.createDraw(ModernistDraw.class);//这一句的入参符合里氏替换
        draw2.draw();
    }
}
