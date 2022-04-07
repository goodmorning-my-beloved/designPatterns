package com.jkun.design.抽象工厂方法模式;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 9:30 2022/2/11 
 */
public abstract class AbstractProductFactory {


    public abstract <T extends Product> T createProductA();
//    public abstract Product  createProductA();

    public abstract <T extends Product> T createProductB();

}
