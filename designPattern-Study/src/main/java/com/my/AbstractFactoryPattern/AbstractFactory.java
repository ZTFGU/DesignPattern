package com.my.AbstractFactoryPattern;

/**
 * @description: 第三步  为 Color 和 Shape 对象创建抽象类来获取工厂。
 * @author:ZhengTengFei
 * @date:2023-02-19 10:39:45
 **/
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeName);
    public abstract Color getColor(String colorName);
}
