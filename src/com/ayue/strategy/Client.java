package com.ayue.strategy;

public class Client {
    public static void main(String[] args) {
        String type = "article";
        DataStrategy dataStrategy = StrategyFactory.getStrategy(type);
        dataStrategy.deal();
    }
}
