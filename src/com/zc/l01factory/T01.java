package com.zc.l01factory;

public class T01 {
	public static void main(String[] args) {
		Factory factory=new PetFactory();
		Dog dog=(Dog) factory.getInstance(Dog.class);
		System.out.println(dog.petSound());
	}
}
