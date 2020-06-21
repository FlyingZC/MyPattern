package com.zc.l03builder;

public class HighEndCarBuilder implements CarBuilder {
    private Car car;

    public HighEndCarBuilder() {
        car = new Car();
    }

    @Override
    public HighEndCarBuilder buildBase() {
        car.setBase("high base" );
        return this;
    }

    @Override
    public HighEndCarBuilder buildWheels() {
        car.setWheel("high price wheels" );
        return this;
    }

    @Override
    public HighEndCarBuilder buildEngine() {
        car.setEngine("high price engine" );
        return this;
    }

    @Override
    public HighEndCarBuilder buildRoof() {
        car.setRoof("high price roof" );
        return this;
    }

    @Override
    public HighEndCarBuilder buildMirrors() {
        car.setMirrors("high price mirrors" );
        return this;
    }

    @Override
    public HighEndCarBuilder buildLights() {
        car.setLights("high price light" );
        return this;
    }

    @Override
    public HighEndCarBuilder buildInterior() {
        car.setInterior("high price interior" );
        return this;
    }

    @Override
    public Car getCar() {
        return car;
    }
}