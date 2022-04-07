package com.jkun.design.接口隔离新;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 18:49 2022/1/31 
 */
public class Searcher extends AbstractSearcher {

    /*抽象类不能实例化，如果有构造函数，则子类继承时需要帮助初始化*/
    public Searcher( IGoodTemperamentGirl goodTemperamentGirl){
        super(goodTemperamentGirl);
    }
    public Searcher( IGoodBodyGirl goodBodyGirl){
        super(goodBodyGirl);
    }

    @Override
    public void show() {
        System.out.println("美女展示：");
        super.goodBodyGirl.goodLooking();
        super.goodBodyGirl.niceFigure();
        super.goodTemperamentGirl.greatTemperament();
    }
}
