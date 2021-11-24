package com.ayue.factory.abstractf;

import com.ayue.factory.abstractf.AbstractFactory;
import com.ayue.factory.simple.HWPhone;
import com.ayue.factory.simple.Phone;

/**
 * 生产华为产品的工厂
 */
public class HWFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new HWPhone();
    }

    @Override
    public PC createPC() {
        return new HWPC();
    }
}
