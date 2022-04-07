package com.jkun.design.代理模式.简单的代理示例;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:56 2022/4/1 
 */
public class Client {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("小明");
        StudentProxy studentProxy = new StudentProxy(student);
        studentProxy.doHomeWork();
    }
}
