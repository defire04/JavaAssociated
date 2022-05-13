package com.company;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car("Bmw");
        Car c2 = new Car("Opel");
        Car c3 = new Car("Ford");






        c1 = null;

        c2 = null;

        c3 = null;
        System.gc();
        System.out.println("end");
    }
}
