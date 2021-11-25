package com.ayue.strategy;

/**
 * 处理视频类型的数据
 */
public class VideoStrategy implements DataStrategy {
    @Override
    public void deal() {
        System.out.println("deal video");
    }
}
