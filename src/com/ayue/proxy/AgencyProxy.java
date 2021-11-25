package com.ayue.proxy;

/**
 * 中介机构代理租房
 */
public class AgencyProxy implements RentHouse {

    private UserRentHouse userRentHouse;

    public AgencyProxy(UserRentHouse userRentHouse) {
        this.userRentHouse = userRentHouse;
    }

    @Override
    public void rent() {
        rentBefore();
        userRentHouse.rent();
        rentAfter();
    }

    private void rentBefore() {
        System.out.println("租房前，中介负责找房");
    }

    private void rentAfter() {
        System.out.println("租房后，中介负责维修");
    }
}
