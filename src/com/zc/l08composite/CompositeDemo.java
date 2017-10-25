package com.zc.l08composite;

public class CompositeDemo {
	public static void main(String[] args) {
		Directory dirOne=new Directory("test123"),
				  dirTwo=new Directory("test456"),
				  dirThr=new Directory("test789");
		LeafFile a=new LeafFile("a.txt"),
				 b=new LeafFile("b.txt"),
				 c=new LeafFile("c.txt"),
				 d=new LeafFile("d.txt"),
				 e=new LeafFile("e.txt");
		dirOne.add(a).add(dirTwo).add(b);
		dirTwo.add(c).add(d).add(dirThr);
		dirThr.add(e);
		dirOne.printName();
	}
}
