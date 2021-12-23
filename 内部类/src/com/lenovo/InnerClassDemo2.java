package com.lenovo;

public class InnerClassDemo2 {
    public void test() {
        //局部内部类
        class InnerClass {
            public void test() {
                System.out.println("InnerClass.test");
            }
        }
        new InnerClass().test();
    }

    public static void main(String[] args) {
        new InnerClassDemo2().test();
    }

}
