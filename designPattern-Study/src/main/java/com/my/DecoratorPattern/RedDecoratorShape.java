package com.my.DecoratorPattern;

/**
 * @description:
 * @author:ZhengTengFei
 * @date:2023-02-20 18:23:45
 **/
public class RedDecoratorShape extends ShapeDecorator{

    public RedDecoratorShape(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRed();
    }
    // 要装饰的内容
    public static void setRed() {
        System.out.println("给形状添加红色");
    }
}
