package com.lenovo;
  class OutClass {
    int out;

    public OutClass(int out) {
        this.out = out;
    }

    @Override
    public String toString() {
        return "OutClass{" +
                "out=" + out +
                '}';
    }
}
public class InnerClassDemo {
    class InnerClass {
        short s;

        public InnerClass(short s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "s=" + s +
                    '}';
        }
    }

    public static void main(String[] args) {
        OutClass oc = new OutClass(1);
        System.out.println(".............." + oc);
        short s = 2;
        InnerClass ic = new InnerClassDemo().new InnerClass(s);

        System.out.println(".............." + ic);

    }
}
