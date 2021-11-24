package com.ayue.factory.method;

import com.ayue.factory.simple.IPhone;
import com.ayue.factory.simple.Phone;

/**
 * 生产苹果手机的工厂
 */
public class AppleFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
