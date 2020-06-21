package com.zc.l03builder;

public class RandCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public CarBuilder buildBase() {
        // TODO Auto-generated method stub
        return null;
    }

    public RandCarBuilder buildBase(String baseName) {
        car.setBase(baseName);
        return this;
    }

    @Override
    public CarBuilder buildWheels() {
        // TODO Auto-generated method stub
        return null;
    }

    public RandCarBuilder buildWheels(String wheelName) {
        car.setWheel(wheelName);
        return this;
    }


    @Override
    public CarBuilder buildEngine() {
        // TODO Auto-generated method stub
        return null;
    }

    public RandCarBuilder buildEngine(String engineName) {
        car.setEngine(engineName);
        return this;
    }

    @Override
    public CarBuilder buildRoof() {
        // TODO Auto-generated method stub
        return null;
    }

    public RandCarBuilder buildRoof(String roofName) {
        car.setRoof(roofName);
        return this;
    }

    @Override
    public CarBuilder buildMirrors() {
        // TODO Auto-generated method stub
        return null;
    }

    public RandCarBuilder buildMirrors(String mirrorName) {
        car.setMirrors(mirrorName);
        return this;
    }

    @Override
    public CarBuilder buildLights() {
        // TODO Auto-generated method stub
        return null;
    }

    public RandCarBuilder buildLights(String lightName) {
        car.setLights(lightName);
        return this;
    }

    @Override
    public CarBuilder buildInterior() {
        // TODO Auto-generated method stub
        return null;
    }

    public RandCarBuilder buildInterior(String intriorName) {
        car.setInterior(intriorName);
        return this;
    }

    @Override
    public Car getCar() {
        return car;
    }

}
