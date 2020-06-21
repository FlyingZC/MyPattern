package com.zc.l11proxy;

//代理类
public class ProxyImage implements Image {
    private String url;

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void showImage() {
        // 该方法会委托给真实图片类
        System.out.println("代理类中的showImage" );
        RealImage real = new RealImage(url);
        real.showImage();
    }

}
