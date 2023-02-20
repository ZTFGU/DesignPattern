package com.my.ChainOfResponsibility;

/**
 * @description: 第二步，创建抽象地处理对象
 * @author:ZhengTengFei
 * @date:2023-02-20 17:20:12
 **/
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler; // 下一个处理者对象
    protected String  name; // 具体处理者的名字 ,例如 校长等等

    // 处理者的名字，我们直接放在构造器里初始化就行。
    public AbstractHandler(String name) {
        this.name = name;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 最后，给一个抽象的处理方法，其他几个具体处理类去处理。
    public abstract void process (LeaveNote leaveNote); // 传入要处理的对象
}
