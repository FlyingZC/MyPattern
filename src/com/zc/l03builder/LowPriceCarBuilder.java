package com.zc.l03builder;
public class LowPriceCarBuilder implements CarBuilder{
	private Car car;
	//构造方法生成car
	public LowPriceCarBuilder(){
		car=new Car();
	}
	@Override
	public LowPriceCarBuilder buildBase() {
		car.setBase("Low price base");	
		return this;
	}
	@Override
	public LowPriceCarBuilder buildWheels() {
		car.setWheel("Low price wheels");
		return this;
	}
	@Override
	public LowPriceCarBuilder buildEngine() {
		car.setEngine("Low price engine");
		return this;
	}
	@Override
	public LowPriceCarBuilder buildRoof() {
		car.setRoof("Low price roof");
		return this;
	}
	@Override
	public LowPriceCarBuilder buildMirrors() {
		car.setMirrors("Low price mirrors");
		return this;
	}
	@Override
	public LowPriceCarBuilder buildLights() {
		car.setLights("Low price light");
		return this;
	}
	@Override
	public LowPriceCarBuilder buildInterior() {
		car.setInterior("Low price interior");
		return this;
	}
	@Override
	public Car getCar() {
		return car;
	}

}
