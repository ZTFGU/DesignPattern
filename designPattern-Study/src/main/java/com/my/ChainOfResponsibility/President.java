package com.my.ChainOfResponsibility;

/**
 * @description: 第三步，校长节点处理请求
 * @author:ZhengTengFei
 * @date:2023-02-20 17:35:49
 **/
public class President  extends AbstractHandler{
    public President(String name) {
        super(name);
    }

    public void process(LeaveNote leaveNote) {
        // 最高级别的处理链如果不设置为双向处理链条的话，就无须设置next
        //if (nextHandler != null) {
            if (leaveNote.getTime() > 5) {
                System.out.println(this.name + "批准了这个假条,"+"请假理由是:"+leaveNote.getReason());
            } else {
                System.out.println(this.name+"无法处理此假条，转交上一级处理.........");
                nextHandler.process(leaveNote);
            }
        //}
    }
}
