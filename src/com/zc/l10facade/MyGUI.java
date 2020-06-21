package com.zc.l10facade;

//门面层(一个简单的接口),用于调用其他复杂GUI
public class MyGUI {
    private GUIMenu menu;
    private GUITitleBar titleBar;
    private GUIContent content;

    public MyGUI() {
        menu = new GUIMenu();
        titleBar = new GUITitleBar();
        content = new GUIContent();
    }

    public void drawGUI() {
        System.out.println("---开始创建GUI---" );
        content.showButtons();
        content.showTextFields();
        content.setDefaultValues();
        menu.drawMenuButtons();
        titleBar.showTitleBar("Title of the GUI" );
        System.out.println("---GUI绘制完毕---" );
    }
}
