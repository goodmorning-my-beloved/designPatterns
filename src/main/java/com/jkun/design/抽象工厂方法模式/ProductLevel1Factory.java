package com.jkun.design.抽象工厂方法模式;

import java.lang.reflect.Constructor;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 9:32 2022/2/11 
 */
public class ProductLevel1Factory extends AbstractProductFactory {
    @Override
    public Product  createProductA() {
        return new ProductAImpl();
    }

    @Override
    public Product  createProductB() {
        return new ProductBImpl();
    }
}
