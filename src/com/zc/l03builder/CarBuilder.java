package com.zc.l03builder;
//生成器接口类
public interface CarBuilder {
	//返回对象本身,方便连缀
	public CarBuilder buildBase (); 
	public CarBuilder buildWheels() ; 
	public CarBuilder buildEngine () ; 
	public CarBuilder buildRoof() ; 
	public CarBuilder buildMirrors(); 
	public CarBuilder buildLights(); 
	public CarBuilder buildInterior(); 
	public Car getCar();
}
