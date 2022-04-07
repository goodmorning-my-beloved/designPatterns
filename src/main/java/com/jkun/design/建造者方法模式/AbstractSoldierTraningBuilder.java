package com.jkun.design.建造者方法模式;

import java.util.ArrayList;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 20:55 2022/3/31 
 */
public abstract class AbstractSoldierTraningBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract AbstractSoldierTraning getSoldierTraningBuilder();

}
