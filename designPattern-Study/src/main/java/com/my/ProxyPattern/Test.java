package com.my.ProxyPattern;

/**
 * @description:
 * @author:ZhengTengFei
 * @date:2023-02-19 11:46:17
 **/
public class Test {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("test.jgp"); // 真实对象
        ProxyImage proxyImage = new ProxyImage(realImage); // 代理真实对象的对象
        proxyImage.display();
    }
}
