package com.jkun.design.接口隔离;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 18:53 2022/1/31 
 */
public class Client {


    public static void main(String[] args) {
        IPrettyGirl girl = new PrettyGirl("小红");
        AbstractSearcher searcher = new Searcher(girl);
        searcher.show();
    }
}
