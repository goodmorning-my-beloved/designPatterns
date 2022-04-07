package com.jkun.design.代理模式.强制代理;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:55 2022/4/1 
 */
public class StudentProxy implements StudentHomeWork {
    private Student student = null;


    public StudentProxy (Student student) {
        this.student = student;
    }

    @Override
    public void doHomeWork() {
        student.doHomeWork();
    }

}
