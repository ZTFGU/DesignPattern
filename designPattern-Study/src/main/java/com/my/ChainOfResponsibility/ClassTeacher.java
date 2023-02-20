package com.my.ChainOfResponsibility;

/**
 * @description: 第三步，创建处理链上的第一个节点，班主任的这个对象
 * @author:ZhengTengFei
 * @date:2023-02-20 17:24:20
 **/
public class ClassTeacher extends AbstractHandler{
    // 继承的是父类的name属性的构造方法
    public ClassTeacher(String name) {
        super(name);
    }

    // 接下来处理 请假条 的这个对象
    public void process(LeaveNote leaveNote) {
        if (nextHandler != null) {
            if (leaveNote.getTime() <=1) {
                System.out.println(this.name + "批准了这个假条,"+"请假理由是:"+leaveNote.getReason());
            } else {
                System.out.println(this.name+"无法处理此假条，转交上一级处理.........");
                nextHandler.process(leaveNote);
            }
        }
    }
}
