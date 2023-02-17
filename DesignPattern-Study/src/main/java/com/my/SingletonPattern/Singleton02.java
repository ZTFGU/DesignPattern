package com.my.SingletonPattern;

/**
 * @description: 单例模式 --- 懒汉式线程安全
 * @author:ZhengTengFei
 * @date:2023-02-17 21:42:29
 **/
public class Singleton02 {
    private Singleton02(){}
    private static Singleton02 instance;

    public  static synchronized Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
}
