package com.my.ProxyPattern;

/**
 * @description: 真实的对象
 * @author:ZhengTengFei
 * @date:2023-02-19 11:35:00
 **/
public class RealImage implements Image{
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadDisk(fileName);
    }


    public void display() {
        System.out.println("展示图片"+ fileName);
    }

    public void loadDisk(String fileName){
        System.out.println("加载图片"+ fileName);
    }
}
