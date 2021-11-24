package com.ayue.factory.abstractf;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory hwFactory = new HWFactory();
        hwFactory.createPhone();
        hwFactory.createPC();
        AbstractFactory appleFactory = new AppleFactory();
        appleFactory.createPhone();
        appleFactory.createPC();
    }
}
