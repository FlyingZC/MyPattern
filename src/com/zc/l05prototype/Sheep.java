package com.zc.l05prototype;

public class Sheep extends Animal{
	@Override
	public Animal clone() {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Sheep [getDescription()=" + getDescription()
				+ ", getNumberOfLegs()=" + getNumberOfLegs() + ", getName()="
				+ getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
