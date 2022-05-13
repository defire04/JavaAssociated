package com.company;

import java.util.Scanner;

public class Controller {

    public static double result = 0;

    public static double firstTask( String task, Model m) {
        Scanner in = new Scanner(System.in);
//        double result = 0;
        switch (task) {
            case "div":
                result = m.firstNumber / m.secondNumber;
                break;
            case "log10":
                result = Math.log10(m.firstNumber + m.secondNumber);
                break;
            case "log":
                result = Math.log(m.firstNumber + m.secondNumber);
                break;
            case "pow":
                result = Math.pow(m.firstNumber, m.secondNumber);
                break;
            default:
                System.out.println("Такого нет!");
                break;
        }
        return result;
    }


    public static double secondTask(String requiredField, Car car, double multiplier) {

//        double result = 0;
        switch (requiredField) {
            case "price":
                result = car.price * multiplier;
                break;
            case "weight":
                result = car.weight * multiplier;
                break;
            case "speed":
                result = car.speed * multiplier;
                break;
            default:
                System.out.println("Такого нет!");
                break;
        }
        return result;
    }


}