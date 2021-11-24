package com.ayue.factory.simple;

public class Demo {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        Phone hwphone = factory.createPhone("HWPhone");
        Phone iphone = factory.createPhone("IPhone");
    }
}
