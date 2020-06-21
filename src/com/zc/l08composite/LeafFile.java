package com.zc.l08composite;

//文件
public class LeafFile implements FileComponent {
    private String fileName;

    public LeafFile(String name) {
        fileName = name;
    }

    @Override
    public void printFileTree() {
        System.out.println("File name:" + fileName);
    }

    @Override
    public String toString() {
        return "File Name:" + fileName;
    }
}
