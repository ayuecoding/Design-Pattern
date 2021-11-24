package com.ayue.factory.abstractf;

/**
 * 华为电脑
 */
public class HWPC implements PC {

    public HWPC() {
        this.createPC();
    }

    @Override
    public void createPC() {
        System.out.println("create HWPC！");
    }
}
