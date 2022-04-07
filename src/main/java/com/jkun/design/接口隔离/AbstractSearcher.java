package com.jkun.design.接口隔离;

import javax.swing.text.AbstractDocument;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 18:47 2022/1/31 
 */
public abstract class AbstractSearcher {

    protected IPrettyGirl prettyGirl;

    public AbstractSearcher(IPrettyGirl prettyGirl){
        this.prettyGirl = prettyGirl;
    }
    public abstract void show();

}
