package com.zc.l03builder;
//导演类,模拟生成car的全过程
public class MechanicalEngineer {
	private CarBuilder carBuilder;
	public MechanicalEngineer(CarBuilder builder){
		this.carBuilder=builder;
	}
	public Car getCar(){
		return carBuilder.getCar();
	}
	public void buildCar(){
		carBuilder.buildBase().buildWheels().buildEngine().
		buildRoof().buildMirrors().buildLights().buildInterior();
	}
	public static void main(String[] args) {
		CarBuilder lowPriceCarBuilder=new LowPriceCarBuilder();
		MechanicalEngineer me=new MechanicalEngineer(lowPriceCarBuilder);
		me.buildCar();
		System.out.println(me.getCar());
		
		//builder自定义的car
		RandCarBuilder randBuilder=new RandCarBuilder();
		randBuilder.buildBase("王牌机").buildEngine("旋风引擎").buildInterior("mirrorss")
		.buildLights("氪金灯").buildMirrors("mirrors").buildRoof("屋顶").buildWheels("钢筋轮");
		System.out.println(randBuilder.getCar());
	}
}
