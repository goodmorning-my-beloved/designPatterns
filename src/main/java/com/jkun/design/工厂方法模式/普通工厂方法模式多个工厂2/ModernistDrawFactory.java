package com.jkun.design.工厂方法模式.普通工厂方法模式多个工厂2;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:21 2022/2/10 
 */
public class ModernistDrawFactory extends AbstractDrawFactory {


    @Override
    public ModernistDraw createDraw()  {
        return new ModernistDraw();
    }
}
