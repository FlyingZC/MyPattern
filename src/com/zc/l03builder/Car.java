package com.zc.l03builder;

public class Car {
	private String base;
	private String wheel;
	private String engine;
	private String roof;
	private String mirrors;
	private String lights;
	private String interior;
	public void setBase(String b) {
		this.base = b;
	}

	public void setWheels(String w) {
		this.wheel = w;
	}

	public void setEngine(String e) {
		this.engine = e;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public void setMirrors(String mirrors) {
		this.mirrors = mirrors;
	}

	public void setLights(String lights) {
		this.lights = lights;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	@Override
	public String toString() {
		return "Car [base=" + base + ", wheel=" + wheel + ", engine=" + engine
				+ ", roof=" + roof + ", mirrors=" + mirrors + ", lights="
				+ lights + ", interior=" + interior + "]";
	}
	
}