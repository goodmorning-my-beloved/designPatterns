package com.jkun.design.工厂方法模式.普通工厂方法模式;

/**
 * @Author: jkun
 * @Description:在interface这种也可以定义这种工厂接口
 * @Date: Create in 15:28 2022/2/10 
 */
public interface SpecialFactory {
    <T extends AbstractDraw> T create(Class<T> c);
}
