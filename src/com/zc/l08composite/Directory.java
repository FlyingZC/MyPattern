package com.zc.l08composite;

import java.util.ArrayList;
import java.util.List;

//目录 可添加文件或子目录
public class Directory implements FileComponent
{
    private String fileName;

    private List<FileComponent> files = new ArrayList<FileComponent>();

    @Override
    public void printFileTree()
    {
        System.out.println(this);
        printFileTree(this, 0);
    }

    public void printFileTree(Directory root, int rootLevel)
    {
        for (int i = 0; i < root.files.size(); ++i)
        {
            FileComponent obj = root.files.get(i);
            for (int j = 0; j <= rootLevel; j++)
            {
                System.out.print("--");
            }
            System.out.println(obj);
            if (obj instanceof Directory)
            {
                printFileTree((Directory) obj, rootLevel + 1);// 此处 不能用++
                // 因为后续循环还停留在这一层,所以rootLevel不能变
            }
        }
    }

    public Directory(String name)
    {
        fileName = name;
    }

    public Directory add(FileComponent obj)
    {
        files.add(obj);
        return this;
    }

    @Override
    public String toString()
    {
        return "Directory Name:" + fileName;
    }
}
