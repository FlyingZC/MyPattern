package com.zc.l09decorator;
//装饰器基类	
public class HouseDecorator implements House{
	protected House house;
	public HouseDecorator(House house){
		this.house=house;
	}
	@Override
	public String makeHouse() {
		return house.makeHouse();
	}

}
