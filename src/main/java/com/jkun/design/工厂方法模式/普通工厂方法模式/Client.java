package com.jkun.design.工厂方法模式.普通工厂方法模式;

/**
 * @Author: jkun
 * @Description:
 * 用于统一创建对象，并对对象进行统一处理，在处理过程尤为艰辛的时候，工厂方法模式越有优势
 *  此外，拥抱变化能力强。在此类统一处理下，
 *  client只需要知道产品的抽象类，不关心生成产品实现的细节，符合迪米特法则
 *  client不依赖细节，符合依赖倒置原则
 *  client使用产品子类替换父类，符合里氏替换原则。
 * @Date: Create in 14:36 2022/2/10 
 */
public class Client {


    public static void main(String[] args) {
        AbstractDrawFactory factory = new DrawFactory();//  业务需要必要的对细节的依赖

        AbstractDraw draw = factory.createDraw(ModernistDraw.class);//这一句的入参符合里氏替换
        draw.draw();
    }
}
