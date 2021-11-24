package com.ayue.factory.abstractf;

/**
 * 苹果电脑
 */
public class MAC implements PC {

    public MAC() {
        this.createPC();
    }

    @Override
    public void createPC() {
        System.out.println("create MAC！");
    }
}
