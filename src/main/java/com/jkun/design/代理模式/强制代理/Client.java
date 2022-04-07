package com.jkun.design.代理模式.强制代理;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:56 2022/4/1 
 */
public class Client {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("小明");
        student.doHomeWork();
        System.out.println("----------------");

        StudentProxy studentProxy = new StudentProxy(student);
        studentProxy.doHomeWork();

        System.out.println("----------------");

        StudentHomeWork studentProxy1 = student.getStudentProxy();
        studentProxy1.doHomeWork();
    }
}
