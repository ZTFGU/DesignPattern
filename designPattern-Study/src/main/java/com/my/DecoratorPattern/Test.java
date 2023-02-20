package com.my.DecoratorPattern;

/**
 * @description:
 * @author:ZhengTengFei
 * @date:2023-02-20 18:37:29
 **/
public class Test {
    public static void main(String[] args) {
        Shape shape = new Circle();
        ShapeDecorator shapeDecorator = new RedDecoratorShape(new Circle());
        ShapeDecorator shapeDecorator1 = new RedDecoratorShape(new Rectangle());
        shape.draw();
        shapeDecorator.draw();
        shapeDecorator1.draw();
    }
}
