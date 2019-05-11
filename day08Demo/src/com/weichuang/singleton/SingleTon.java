package com.weichuang.singleton;

import com.weichuang.proxy.Person;

/**
 * 懒汉式
 */
public class SingleTon {


    private SingleTon(){
        new RuntimeException("此类为单例模式，不允许实例化多个对象！");
    }

    private static volatile SingleTon singleTon = null;

    public static SingleTon getSingleTon(){

        if(singleTon == null){
            synchronized(SingleTon.class){ //控制多线程
                if(singleTon == null){
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }
}
