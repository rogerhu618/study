package com.lenovo.pattern.mediator;

/**
 * @Author Roger Hu
 * @Date 2021/12/23 8:10
 * @ClassName com.lenovo.pattern.mediator.HouseOwner
 * @Version 1.0
 * @Description 具体同事角色类
 */
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }
    //和中介沟通
    public void contact(String message) {
        mediator.constact(message,this);
    }
    //获取信息
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息是:" + message);
    }
}
