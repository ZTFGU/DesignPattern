package com.my.AbstractFactoryPattern;

/**
 * @description: 第四步   ，创建图形工厂，继承抽象工厂
 * @author:ZhengTengFei
 * @date:2023-02-19 10:42:42
 **/
public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeName) {
        if (shapeName == null) return null;
        if (shapeName.equals("Circle")) {
            return new Circle();
        } else if (shapeName.equals("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }

    public Color getColor(String colorName) {
        return null;
    }
}
