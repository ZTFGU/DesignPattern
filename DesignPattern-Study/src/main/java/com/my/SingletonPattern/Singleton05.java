package com.my.SingletonPattern;

/**
 * @description: 单例模式 --- 静态内部类
 * @author:ZhengTengFei
 * @date:2023-02-17 21:50:05
 **/
public class Singleton05 {
    private Singleton05() {}
    // 静态内部类
    private static class InnerClass {
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    public static final Singleton05 getInstance(){
        return InnerClass.INSTANCE;
    }
}
