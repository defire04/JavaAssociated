package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1\n");

        Model m1 = new Model(50, 2);

        View.displayResult(Controller.firstTask("div", m1));
        View.displayResult(Controller.firstTask("log10", m1));
        View.displayResult(Controller.firstTask("log", m1));
        View.displayResult(Controller.firstTask("pow", m1));

        System.out.println("\nЗадание 2\n");

        Car car = new Car(10, 20, 30);

        View.displayResult(Controller.secondTask("price", car, 3));
        View.displayResult(Controller.secondTask("weight", car, 3));
        View.displayResult(Controller.secondTask("speed", car, 3));

    }
}
