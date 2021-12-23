package com.lenovo.pattern.mediator;

/**
 * @Author Roger Hu
 * @Date 2021/12/23 7:45
 * @ClassName com.lenovo.pattern.mediator.Person
 * @Version 1.0
 * @Description 抽象同事角色类
 */
public abstract class Person {
    protected String name;
    protected  Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
