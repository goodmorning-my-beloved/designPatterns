package com.jkun.design.接口隔离新;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 18:47 2022/1/31 
 */
public abstract class AbstractSearcher {

    protected IGoodTemperamentGirl goodTemperamentGirl;
    protected IGoodBodyGirl goodBodyGirl;


    public AbstractSearcher( IGoodTemperamentGirl goodTemperamentGirl){
        this.goodTemperamentGirl = goodTemperamentGirl;
    }

    public AbstractSearcher(IGoodBodyGirl goodBodyGirl){
        this.goodBodyGirl = goodBodyGirl;
    }

    public abstract void show();

}
