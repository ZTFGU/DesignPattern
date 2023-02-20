package com.my.DecoratorPattern;

/**
 * @description: Shape的一个装饰器
 * @author:ZhengTengFei
 * @date:2023-02-20 18:19:27
 **/
public class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    public void draw() {
        decoratorShape.draw();
    }
}

