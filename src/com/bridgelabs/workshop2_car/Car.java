package com.bridgelabs.workshop2_car;

public class Car<T> {
    private T brand;
    private T model;
    private T topSpeed;
    private T fuelType;

    public Car(T brand, T model, T topSpeed, T fuelType) {
        this.brand = brand;
        this.model = model;
        this.topSpeed = topSpeed;
        this.fuelType = fuelType;
    }

    public T getBrand() {
        return brand;
    }

    public void setBrand(T brand) {
        this.brand = brand;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public T getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(T topSpeed) {
        this.topSpeed = topSpeed;
    }

    public T getFuelType() {
        return fuelType;
    }

    public void setFuelType(T fuelType) {
        this.fuelType = fuelType;
    }
    public String toString() {
        return "Brand name: "+brand+"\nModel: "+model+"Top Speed: "+topSpeed+"FuelType: "+fuelType;
    }
}
