package com.my.SingletonPattern;

/**
 * @description: 单例模式---饿汉式
 * @author:ZhengTengFei
 * @date:2023-02-17 21:46:18
 **/
public class Singleton03 {
    private Singleton03(){}
    private static Singleton03 instance = new Singleton03();
    public static Singleton03 getInstance(){
        return instance;
    }
}
