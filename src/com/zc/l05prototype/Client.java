package com.zc.l05prototype;

public class Client {
	public static void main(String[] args) {
		AnimalCreator creator=new AnimalCreator();
		Animal an1=new Animal("动物1","四条腿","叫动物",new String[]{"哈","呵"});
		System.out.println(an1);
		
		Animal copyAn1=an1.clone();
		System.out.println(copyAn1);
		System.out.println(an1==copyAn1);
		//浅拷贝
		System.out.println(an1.getName()==copyAn1.getName());
		System.out.println(an1.getHobbies()==copyAn1.getHobbies());
		//修改原始对象属性 会 影响到 浅拷贝的对象中的相应属性
		an1.setName("更改后的动物姓名");
		an1.setHobbies(new String[]{"ds","df"});
		System.out.println(an1);
		System.out.println(copyAn1);
	}
}
