package com.ayue.factory.method;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory hwFactory = new HWFactory();
        AbstractFactory appleFactory = new AppleFactory();
        hwFactory.createPhone();
        appleFactory.createPhone();
    }
}
