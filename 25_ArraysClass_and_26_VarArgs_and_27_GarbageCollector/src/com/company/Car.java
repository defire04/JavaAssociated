package com.company;

public class Car {
    String model;



    Car(String model){
        this.model = model;
    }


    public void finalize() {

        System.out.println(model);
    }
}
