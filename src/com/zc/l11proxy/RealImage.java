package com.zc.l11proxy;

public class RealImage implements Image {
    public RealImage(String url) {
        loadImage(url);
    }

    @Override
    public void showImage() {
        System.out.println("RealImage类中的showImage" );
    }

    public void loadImage(String url) {

    }
}
