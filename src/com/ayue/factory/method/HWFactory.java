package com.ayue.factory.method;

import com.ayue.factory.simple.HWPhone;
import com.ayue.factory.simple.Phone;

/**
 * 生产华为手机的工厂
 */
public class HWFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new HWPhone();
    }
}
