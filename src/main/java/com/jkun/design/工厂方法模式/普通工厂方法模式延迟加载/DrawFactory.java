package com.jkun.design.工厂方法模式.普通工厂方法模式延迟加载;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: jkun
 * @Description:缓存实例
 *
 * “延迟加载还可以用在对象初始化比较复杂的情况下，
 * 例如硬件访问，涉及多方面的交互，
 * 则可以通过延迟加载降低对象的产生和销毁带来的复杂性。”
 * @Date: Create in 14:21 2022/2/10 
 */
public class DrawFactory extends AbstractDrawFactory {

    private static final Map<String,AbstractDraw> map = new HashMap<>();

    @Override
    public <T extends AbstractDraw> T createDraw(Class<T> c)  {
            T t = null;
        try {
            if (map.containsKey(c.getSimpleName())) {
                t = (T)map.get(c.getSimpleName());
            }
            else {
                t = (T)Class.forName(c.getName()).newInstance();
                t.setName("小明");
                map.put(c.getSimpleName(),t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return t;
    }
}
