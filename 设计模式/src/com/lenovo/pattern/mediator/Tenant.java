package com.lenovo.pattern.mediator;

/**
 * @Author Roger Hu
 * @Date 2021/12/23 7:49
 * @ClassName com.lenovo.pattern.mediator.Tenant
 * @Version 1.0
 * @Description 具体同事角色类
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }
    //和中介沟通
    public void contact(String message) {
        mediator.constact(message,this);
    }
    //获取信息
    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息是:" + message);
    }
}
