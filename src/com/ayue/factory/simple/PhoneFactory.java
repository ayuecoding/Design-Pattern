package com.ayue.factory.simple;

/**
 * 制造手机的工厂
 */
public class PhoneFactory {
    public Phone createPhone(String type) {
        if (type.equals("HWPhone"))
            return new HWPhone();
        else if (type.equals("IPhone"))
            return new IPhone();
        return null;
    }
}
