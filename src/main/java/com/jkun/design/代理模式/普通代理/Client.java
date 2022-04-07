package com.jkun.design.代理模式.普通代理;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:56 2022/4/1 
 */
public class Client {

    public static void main(String[] args) {
        StudentProxy studentProxy = new StudentProxy("小明");
        studentProxy.doHomeWork();
    }
}
