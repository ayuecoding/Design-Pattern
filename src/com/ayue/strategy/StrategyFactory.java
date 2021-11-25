package com.ayue.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建策略的工厂
 */
public class StrategyFactory {
    /**
     * 查表法：使用 map 来缓存策略
     * 每次根据 type 直接从 map 获取策略，避免 if-else
     */
    private static final Map<String, DataStrategy> strategies = new HashMap<>();

    static {
        strategies.put("article", new ArticleStrategy());
        strategies.put("video", new VideoStrategy());
    }

    public static DataStrategy getStrategy(String type) {
        return strategies.get(type);
    }
}
