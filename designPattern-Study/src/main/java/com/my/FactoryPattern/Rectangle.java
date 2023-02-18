package com.my.FactoryPattern;

/**
 * @description: 第二步 定义接口的实现类
 * @author:ZhengTengFei
 * @date:2023-02-18 22:53:27
 **/
public class Rectangle implements Shape{

    public void draw() {
        System.out.println("画了一个矩形");
    }
}
