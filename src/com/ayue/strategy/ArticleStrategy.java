package com.ayue.strategy;

/**
 * 处理文章类型的数据
 */
public class ArticleStrategy implements DataStrategy {
    @Override
    public void deal() {
        System.out.println("deal article");
    }
}
