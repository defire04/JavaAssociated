package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;


@FunctionalInterface
interface MyComparable<T, U, V, W> {
    W comparing(T p1, U p2, V p3);
}

public class Main {
    public static void main(String[] args) {

        BiPredicate<Car, Integer> lowerSpeed = (car, speed) -> {
            return car.getMaxSpeed() < speed;
        };

        MyComparable<List<Car>, BiPredicate<Car, Integer>, Integer, List<List<Car>>> carsComparator = (list, biPred, level) -> {
            List<List<Car>> result = new ArrayList<>();
            List<Car> lowers = new ArrayList<>();
            List<Car> uppers = new ArrayList<>();

            for (Car temp : list) {
                if (biPred.test(temp, level)) {
                    lowers.add(temp);
                } else {
                    uppers.add(temp);
                }
            }
            result.add(lowers);
            result.add(uppers);
            return result;
        };

        System.out.println(carsComparator.comparing(Car.createManyCars(20), lowerSpeed, 95));

    }
}

