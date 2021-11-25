package com.ayue.proxy;

public class Demo {
    public static void main(String[] args) {
        AgencyProxy agencyProxy = new AgencyProxy(new UserRentHouse());
        agencyProxy.rent();
    }
}
