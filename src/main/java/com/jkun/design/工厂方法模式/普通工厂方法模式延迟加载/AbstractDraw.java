package com.jkun.design.工厂方法模式.普通工厂方法模式延迟加载;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:15 2022/2/10 
 */
public abstract class AbstractDraw {
    private String name;
    public abstract void draw();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
