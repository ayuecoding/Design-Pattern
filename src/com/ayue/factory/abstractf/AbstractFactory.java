package com.ayue.factory.abstractf;

import com.ayue.factory.simple.Phone;

/**
 * 生产不同产品的工厂
 */
public interface AbstractFactory {
    Phone createPhone();
    PC createPC();
}
