package com.jkun.design.抽象工厂方法模式;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 9:36 2022/2/11 
 */
public class Client {


    public static void main(String[] args) {
        AbstractProductFactory factory = new ProductLevel1Factory();
        Product productA = factory.createProductA();

        productA.dance();
        productA.talk();
        productA.showLevel();
    }
}
