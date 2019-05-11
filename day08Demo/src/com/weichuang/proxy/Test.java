package com.weichuang.proxy;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Person p = new Person();
        MyProxy proxy = new MyProxy(p);
        IFly iFly = (IFly)Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), proxy);
        iFly.fly();
    }

    @org.junit.Test
    public void testAdd(){
        System.out.println("测试junit");
    }
}
