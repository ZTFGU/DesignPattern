package com.my.SingletonPattern;

/**
 * @description: 单例模式---懒汉式线程不安全
 * @author:ZhengTengFei
 * @date:2023-02-17 21:38:02
 **/
public class Singleton01 {
    private Singleton01(){}
    private static Singleton01 instance;
    public static Singleton01 getInstance() {
        if (instance == null) {
           instance = new Singleton01();
        }
        return instance;
    }
}
