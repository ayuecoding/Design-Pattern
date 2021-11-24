package com.ayue.factory.simple;

/**
 * 制造华为手机
 */
public class HWPhone implements Phone {

    public HWPhone() {
        this.create();
    }

    @Override
    public void create() {
        System.out.println("create huawei phone!");
    }
}
