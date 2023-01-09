package com.bridgelabs.workshop2_car;

interface UseCar<T> {
    T acceleration(T accelerate);
    T breaking(T breaks);
}
