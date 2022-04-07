package com.jkun.design.接口隔离新;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 18:45 2022/1/31 
 */
public class PrettyGirl implements IGoodBodyGirl,IGoodTemperamentGirl {

    private String name;
    public PrettyGirl(String name){
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(name + "脸蛋漂亮");
    }

    @Override
    public void niceFigure() {
        System.out.println(name + "气质很好");
    }

    @Override
    public void greatTemperament() {
        System.out.println(name + "身材很棒");
    }
}
