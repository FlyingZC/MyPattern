package com.zc.l09decorator.my;

public class Test {
    public static void main(String[] args) {
        Obj obj = new ObjConcret();
        Obj a = new DecoratorA(obj);
        Obj b = new DecoratorB(a);
        Obj c = new DecoratorC(b);
        Obj d = new DecoratorD(c);
        System.out.println(d.getSum());

        System.out.println(new DecoratorD(new DecoratorC(new DecoratorB(new DecoratorA(obj)))).getSum());
    }
}
