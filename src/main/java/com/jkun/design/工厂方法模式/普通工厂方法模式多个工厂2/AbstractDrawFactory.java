package com.jkun.design.工厂方法模式.普通工厂方法模式多个工厂2;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:19 2022/2/10 
 */
public abstract class AbstractDrawFactory {


    public abstract <T extends AbstractDraw> T createDraw()  ;

}
