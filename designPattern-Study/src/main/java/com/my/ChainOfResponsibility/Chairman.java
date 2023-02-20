package com.my.ChainOfResponsibility;

/**
 * @description: 第三步，创建主任这个节点，处理请求
 * @author:ZhengTengFei
 * @date:2023-02-20 17:31:45
 **/
public class Chairman extends AbstractHandler {
    public Chairman(String name) {
        super(name);
    }

    // 主任处理请求
    public void process(LeaveNote leaveNote) {
        if (nextHandler != null) {
            if (leaveNote.getTime() >1 && leaveNote.getTime() <=5) {
                System.out.println(this.name + "批准了这个假条,"+"请假理由是:"+leaveNote.getReason());
            } else {
                System.out.println(this.name+"无法处理此假条，转交上一级处理.........");
                nextHandler.process(leaveNote);
            }
        }
    }
}
