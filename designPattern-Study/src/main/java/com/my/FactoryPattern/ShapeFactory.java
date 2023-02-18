package com.my.FactoryPattern;

/**
 * @description: 第三步  实现制造产品的工厂
 * @author:ZhengTengFei
 * @date:2023-02-18 22:55:04
 **/
public class ShapeFactory {

    public Shape getShape (String shapeName) {
        if (shapeName.equals("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equals("Circle")) {
            return new Circle();
        }
        return null;
    }
}
