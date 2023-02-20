package com.my.ChainOfResponsibility;

/**
 * @description:
 * @author:ZhengTengFei
 * @date:2023-02-20 17:36:48
 **/
public class Test {
    public static void main(String[] args) {
        // 创建要处理的事件 的对象
        LeaveNote leaveNote  = new LeaveNote("张三",10,"准备炸药，炸学校。");

        // 创建具体地处理类的对象
        ClassTeacher classTeacher  = new ClassTeacher("班主任");
        Chairman chairman = new Chairman("主任");
        President president = new President("校长");

        // 设置他们之间的链条处理顺序,从最低级别开始
        classTeacher.setNextHandler(chairman);
        chairman.setNextHandler(president);
        // 小提示！如果想设置成一个闭合的处理链条的话(就是双向的处理链) 代码如下这一行。我们现在做的事单向处理链
        //president.setNextHandler(classTeacher);

        // 调用最低级别的处理的方法
        classTeacher.process(leaveNote);
    }
}
