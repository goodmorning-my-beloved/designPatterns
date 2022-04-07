package com.jkun.design.抽象工厂方法模式;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 9:25 2022/2/11 
 */
public abstract class ProductA extends Product {
    public void aOnly(){
        System.out.println("only a");
    }

    public void talk() {
        System.out.println("say a");
    }

    public void dance() {
        System.out.println("dance a");
    }
}
