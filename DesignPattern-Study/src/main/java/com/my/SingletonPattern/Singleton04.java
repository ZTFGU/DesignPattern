package com.my.SingletonPattern;

/**
 * @description: 单例模式---双检锁
 * @author:ZhengTengFei
 * @date:2023-02-17 21:47:25
 **/
public class Singleton04 {
    private Singleton04(){}
    private static volatile Singleton04 instance; // volatile 防止指令重排序

    public static Singleton04 getInstance() {
        if (instance == null) {
            synchronized (Singleton04.class){
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}
