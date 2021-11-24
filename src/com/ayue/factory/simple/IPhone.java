package com.ayue.factory.simple;

/**
 * 制造苹果手机
 */
public class IPhone implements Phone {

    public IPhone() {
        this.create();
    }

    @Override
    public void create() {
        System.out.println("create iphone phone!");
    }
}
