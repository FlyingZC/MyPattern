package com.zc.l11proxy;

public class TestProxy {
    public static void main(String[] args) {
        Image img = new ProxyImage("a.jpg" );
        img.showImage();
    }
}
