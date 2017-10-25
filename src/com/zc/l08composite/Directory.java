package com.zc.l08composite;

import java.util.ArrayList;
import java.util.List;
//目录 可添加文件或子目录
public class Directory implements FileComponent{
	private String fileName;
	private List<FileComponent> files=new ArrayList<FileComponent>();
	@Override
	public void printName() {
		System.out.println("Directory Name:"+fileName);
		for(int i=0;i<files.size();++i){
			FileComponent obj=files.get(i);
			obj.printName();
		}
	}
	public Directory(String name){
		fileName=name;
	}
	public Directory add(FileComponent obj){
		files.add(obj);
		return this;
	}

}
