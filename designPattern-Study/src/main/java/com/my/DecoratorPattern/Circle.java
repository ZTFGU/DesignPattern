package com.my.DecoratorPattern;

/**
 * @description:第二步，实现 Shape
 * @author:ZhengTengFei
 * @date:2023-02-20 18:18:16
 **/
public class Circle implements Shape{

    public void draw() {
        System.out.println("画了一个圆");
    }
}
