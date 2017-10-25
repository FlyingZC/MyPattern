package com.zc.l05prototype;

import java.util.Arrays;

//Animal原型类,定义clone方法来实现对  两个子类型  或  具体原型类  的克隆操作
//必须实现Cloneable接口,否则报CloneNotSupportedException
public class Animal implements Cloneable{
	private String description;
	private String numberOfLegs;
	private String name;
	private String[] hobbies;
	@Override
	public Animal clone(){
		Animal clonedAnimal=null;
		try{//默认clone方法进行的是浅拷贝
			clonedAnimal=(Animal)super.clone();
			/*clonedAnimal.setDescription(description);
			clonedAnimal.setNumberOfLegs(numberOfLegs);
			clonedAnimal.setName(name);
			clonedAnimal.setHobbies(hobbies);*/
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clonedAnimal;
	}
	
	public Animal() {
		super();
	}

	public Animal(String description, String numberOfLegs, String name,String[] hobbies) {
		super();
		this.description = description;
		this.numberOfLegs = numberOfLegs;
		this.name = name;
		this.hobbies=hobbies;
	}

	public String getDescription() {
		return description;
	}
	public String getNumberOfLegs() {
		return numberOfLegs;
	}
	public String getName() {
		return name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setNumberOfLegs(String numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Animal [description=" + description + ", numberOfLegs="
				+ numberOfLegs + ", name=" + name + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}

}
