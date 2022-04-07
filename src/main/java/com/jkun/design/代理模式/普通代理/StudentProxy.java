package com.jkun.design.代理模式.普通代理;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:55 2022/4/1 
 */
public class StudentProxy implements StudentHomeWork {
    private Student student = null;
    public StudentProxy (String name) {
        //  此时this不为空
        try {
            this.student = new Student(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void doHomeWork() {
        student.doHomeWork();
    }
}
