package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> carArrayList1 = new ArrayList<>();
        carArrayList1.add(new Car("BMW", "Serge", 4000, 2015));
        carArrayList1.add(new Car("AUDI", "Dima", 10000, 2021));
        carArrayList1.add(new Car("AUDI", "Serge", 5000, 2016));

        // First solution
        Car finderByOwner = new Car("0", "Dima", 0, 2021);
        System.out.println(carArrayList1.contains(finderByOwner));

        // Second solution
        System.out.println(finderByOwner.findCarByField(carArrayList1, "produceYear"));


    }
}

