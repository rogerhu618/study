package com.lenovo.pattern.mediator;

/**
 * @Author Roger Hu
 * @Date 2021/12/23 8:16
 * @ClassName com.lenovo.pattern.mediator.MediatorStructure
 * @Version 1.0
 * @Description 具体的中介者角色类
 */
public class MediatorStructure extends Mediator{
    //聚合房主和租房者
    private  HouseOwner houseOwner;
    private  Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
