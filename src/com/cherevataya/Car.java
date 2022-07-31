package com.cherevataya;

public class Car {
    private String model;
    private String mark; //numberPlate;

    public Car(String model, String mark) {
        this.model = model;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
