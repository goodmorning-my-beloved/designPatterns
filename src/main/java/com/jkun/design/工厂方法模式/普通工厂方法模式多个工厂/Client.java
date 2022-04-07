package com.jkun.design.工厂方法模式.普通工厂方法模式多个工厂;

/**
 * @Author: jkun
 * @Description:
 * 依然是普通工厂方法模式，如果工厂过多的话，往往会提供一个协调类，避免调用者与各个子工厂交流
 * @Date: Create in 14:36 2022/2/10
 */
public class Client {


    public static void main(String[] args) {
        AbstractDrawFactory factory = new BigManDrawFactory();//  业务需要必要的对细节的依赖
        AbstractDraw draw = factory.createDraw(ModernistDraw.class);//这一句的入参符合里氏替换
        draw.draw();
    }
}
