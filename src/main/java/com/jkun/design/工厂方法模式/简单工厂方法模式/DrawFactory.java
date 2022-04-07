package com.jkun.design.工厂方法模式.简单工厂方法模式;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:21 2022/2/10 
 */
public class DrawFactory {

    public static <T extends AbstractDraw> T createDraw(Class<T> c)  {
            T t = null;
        try {
            //  全限定名获取Class对象并实例化(泛型无法用new关键字实例)
            t = (T)Class.forName(c.getName()).newInstance();
            //  希望统一处理
            t.setName("小明");
        } catch (Exception e) {
            e.printStackTrace();
        }

//        T t = (T)c.forName(c.getName()).newInstance();
        return t;
    }
}
