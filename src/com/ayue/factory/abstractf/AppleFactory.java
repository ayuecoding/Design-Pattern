package com.ayue.factory.abstractf;

import com.ayue.factory.abstractf.AbstractFactory;
import com.ayue.factory.simple.IPhone;
import com.ayue.factory.simple.Phone;

/**
 * 生产苹果产品的工厂
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public PC createPC() {
        return new MAC();
    }
}
