package com.ayue.proxy;

/**
 * 用户租房
 */
public class UserRentHouse implements RentHouse{
    @Override
    public void rent() {
        System.out.println("用户租房！");
    }
}
