package com.jkun.design.接口隔离;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 18:49 2022/1/31 
 */
public class Searcher extends AbstractSearcher {

    /*抽象类不能实例化，如果有构造函数，则子类继承时需要帮助初始化*/
    public Searcher(IPrettyGirl prettyGirl) {
        super(prettyGirl);
    }

    @Override
    public void show() {
        System.out.println("美女展示：");
        super.prettyGirl.goodLooking();
        super.prettyGirl.niceFigure();
        super.prettyGirl.greatTemperament();
    }
}
