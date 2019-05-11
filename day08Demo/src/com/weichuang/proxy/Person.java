package com.weichuang.proxy;

public class Person implements IShopping , IFly{
    @Override
    public void buy() {
        System.out.println("购买商品！");
    }

    @Override
    public void fly() {
        System.out.println("我是超人！");
    }
}
