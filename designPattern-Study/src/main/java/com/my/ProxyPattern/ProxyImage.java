package com.my.ProxyPattern;

/**
 * @description:
 * @author:ZhengTengFei
 * @date:2023-02-19 11:38:35
 **/
public class ProxyImage implements Image{
    private RealImage realImage;

    public ProxyImage(RealImage realImage) {
        this.realImage = realImage;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(realImage.getFileName());
        }
        realImage.display();
    }
}
