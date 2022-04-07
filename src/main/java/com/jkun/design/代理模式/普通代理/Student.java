package com.jkun.design.代理模式.普通代理;

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
    public Student (StudentHomeWork student,String name) throws Exception {
        //  该判断是控制实例必须被代理类实例，防止实例被直接用户显示初始化的。
        //  这里传参应该是多态，具体类走不通
        if (student == null) {
            throw new Exception("不能显示实例化真实类");
        }
        this.name = name;
    }
    @Override
    public void doHomeWork() {
        System.out.println(this.name+"写作业");
    }
}
