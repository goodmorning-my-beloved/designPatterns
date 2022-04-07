package com.jkun.design.接口隔离新;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 18:53 2022/1/31 
 */
public class Client {


    public static void main(String[] args) {
        IGoodBodyGirl girl = new PrettyGirl("小花");
        AbstractSearcher searcher = new Searcher(girl);
        searcher.show();
    }
}
