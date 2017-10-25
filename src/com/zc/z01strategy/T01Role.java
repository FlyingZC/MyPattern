package com.zc.z01strategy;

public class T01Role {
	public static void main(String[] args) {
		Role roleA=new RoleA();
		roleA.setAttack(new BaseAttack())
		.setDisplay(new BaseDisplay()).setName(new BaseName());
		roleA.attack();
		roleA.define();
		roleA.display();
		
		Role roleB=new RoleB();
		roleB.setAttack(new AnotherAttack())
		.setDisplay(new AnotherDisplay())
		.setName(new AnotherName());
		roleB.attack();
		roleB.define();
		roleB.display();
		
	}
}
