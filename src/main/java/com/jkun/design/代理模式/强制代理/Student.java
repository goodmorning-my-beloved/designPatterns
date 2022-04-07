package com.jkun.design.代理模式.强制代理;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:54 2022/4/1 
 */
public class Student implements StudentHomeWork {
    private String name;

    private StudentHomeWork studentProxy = null;

    @Override
    public void doHomeWork() {
        if (isProxy()) {
            System.out.println(this.name+"在做作业");
        } else {
            System.out.println("请使用代理");
        }
    }


    public StudentHomeWork getStudentProxy() {
        this.studentProxy = new StudentProxy(this);
        return this.studentProxy;
    }

    public void setName (String name) {
        this.name = name;
    }


    private boolean isProxy() {
        if (studentProxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
