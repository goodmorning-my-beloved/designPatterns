package com.jkun.design.抽象工厂方法模式;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 9:32 2022/2/11 
 */
public class ProductLevel2Factory extends AbstractProductFactory {
    @Override
    public Product  createProductA() {
        return new ProductA2Impl();
    }

    @Override
    public Product  createProductB() {
        return new ProductB2Impl();
    }
}
