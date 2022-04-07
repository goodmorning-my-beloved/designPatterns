package com.jkun.design.抽象工厂方法模式;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 9:26 2022/2/11 
 */
public abstract class ProductB extends Product {

    public void bOnly(){
        System.out.println("only b");
    }
    public void talk() {
        System.out.println("say b");
    }
    public void dance() {
        System.out.println("dance b");
    }
}
