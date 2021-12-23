package com.lenovo;

public class InnerClassDemo1 {
    private static class InnerClass{
        String  ic = "innerClass";
        public static void test() {
            System.out.println("innerClass test");
        }
    }
    public static void test() {
        System.out.println(new InnerClass().ic);
    }

    public static void main(String[] args) {
//        InnerClassDemo1.InnerClass ic = new InnerClassDemo1.InnerClass();
//        System.out.println(ic.ic);
//        test();
          InnerClass.test();
          String ic = new InnerClass().ic;
    }
}
