package com.lenovo.pattern.mediator;

/**
 * @Author Roger Hu
 * @Date 2021/12/23 7:42
 * @ClassName com.lenovo.pattern.mediator.Mediator
 * @Version 1.0
 * @Description 抽象中介者角色类
 */
public abstract class Mediator {
    public abstract void constact(String message,Person person);
}
