package com.zc.l19observer.push;

/**
 * 报纸对象，具体的目标实现
 */
public class NewsPaper extends Subject {
    /**
     * 报纸的具体内容
     */
    private String content;

    /**
     * 获取报纸的具体内容
     *
     * @return 报纸的具体内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 示意，设置报纸的具体内容，相当于要出版报纸了
     *
     * @param content 报纸的具体内容
     */
    public void setContent(String content) {
        this.content = content;
        //内容有了，说明又出报纸了，那就通知所有的读者
        notifyObservers(content);// 这是采用推的方式.直接把发布者的内容传给 观察者
    }
}
