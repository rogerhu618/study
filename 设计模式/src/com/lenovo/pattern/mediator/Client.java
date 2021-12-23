package com.lenovo.pattern.mediator;

/**
 * @Author Roger Hu
 * @Date 2021/12/23 8:25
 * @ClassName com.lenovo.pattern.mediator.Client
 * @Version 1.0
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediator = new MediatorStructure();
        //创建租房者对象
        Tenant tenant = new Tenant("李四",mediator);
        //创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三",mediator);
        //中介者要知道具体的房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);
        tenant.contact("我要租三室的房子!!");
        houseOwner.contact("我这里有三室的房子，你要租吗？");
    }
}
