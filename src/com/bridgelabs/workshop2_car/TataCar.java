package com.bridgelabs.workshop2_car;

import java.util.ArrayList;
import java.util.Arrays;

public class TataCar<T> implements UseCar<T> {
    @Override
    public T acceleration(T accelerate) {
        return accelerate;
    }

    @Override
    public T breaking(T breaks) {
        return breaks;
    }
    ArrayList<Car> tatacars = new ArrayList<>();
    public void addCarDetails(T brand, T model, T topSpeed, T fuelType, int n) {

        for(int i = 0; i < n; i++) {
            Car car = new Car(brand, model, topSpeed, fuelType);
            tatacars.add(car);
        }
    }
}
