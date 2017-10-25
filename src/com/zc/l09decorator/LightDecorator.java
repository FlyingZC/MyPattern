package com.zc.l09decorator;

public class LightDecorator extends HouseDecorator{

	public LightDecorator(House house) {
		super(house);
	}
	
	private String addLight(){
		return "+ Light";
	}
	
	@Override
	public String makeHouse() {
		return house.makeHouse()+addLight();
	}
}
