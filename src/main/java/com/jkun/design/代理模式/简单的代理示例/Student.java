package com.jkun.design.代理模式.简单的代理示例;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:54 2022/4/1 
 */
public class Student implements StudentHomeWork {
    private String name;
    public void setName (String name) {
        this.name = name;
    }

    @Override
    public void doHomeWork() {
        System.out.println(this.name+"写作业");
    }
}
