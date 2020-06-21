package com.zc.l08composite;

// 文件系统接口	可包括目录	和 文件.相当于这个接口统一了file和leafFile
public interface FileComponent {
    /**
     * 递归输出文件树结构
     */
    public void printFileTree();
}
