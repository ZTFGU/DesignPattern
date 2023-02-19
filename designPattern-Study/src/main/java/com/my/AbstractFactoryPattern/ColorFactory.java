package com.my.AbstractFactoryPattern;

/**
 * @description: 第五步
 * @author:ZhengTengFei
 * @date:2023-02-19 10:44:49
 **/
public class ColorFactory extends AbstractFactory{
    public Shape getShape(String shapeName) {
        return null;
    }

    public Color getColor(String colorName) {
        if (colorName == null) return null;
        if (colorName.equals("Red")) {
            return new Red();
        } else  if (colorName.equals("Blue")) {
            return new Blue();
        }
        return null;
    }
}
