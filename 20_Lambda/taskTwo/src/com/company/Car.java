package com.company;


import java.util.ArrayList;
import java.util.List;

class Car {
    private int maxSpeed;


    Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }


    public String toString() {
        return  this.maxSpeed + "";
    }

    public static List<Car> createManyCars(int numberOfCar){
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < numberOfCar; i++) {
            int speed = (int)(Math.random() * 200);
            result.add(new Car(speed));
        }
        return result;
    }
}

