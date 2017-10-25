package com.zc.l08composite;
//文件
public class LeafFile implements FileComponent{
	private String fileName;
	public LeafFile(String name){
		fileName=name;
	}
	@Override
	public void printName() {
		System.out.println("File name:"+fileName);
	}
}
