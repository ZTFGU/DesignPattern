package com.my.ChainOfResponsibility;

/**
 * @description: 第一步，创建请假条的对象，>=1 天班主任审批,   > 1天 <=5天的主任审批,   > 5天的校长审批
 * @author:ZhengTengFei
 * @date:2023-02-20 17:13:00
 **/
public class LeaveNote {
    private String name; // 请假人的名字
    private int time; // 请假天数
    private String reason; // 请假的理由

    // 只做一个构造器的初始化对象就行，不用写setter getter方法
    public LeaveNote(String name, int time, String reason) {
        this.name = name;
        this.time = time;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
