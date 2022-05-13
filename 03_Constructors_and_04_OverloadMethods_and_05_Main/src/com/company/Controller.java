package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    public static void launcher(Model model) {
        switch (model.name) {
            case "MARKS":
                View.printForUser(marks(model.numArrays));
                break;
            case "WEEK_DAYS":
                View.printForUser(weekDays(model.numArrays));
                break;
            case "PLANETS":
                View.printForUser(planets(model.numArrays));
                break;
            default:
                System.out.println("There is no such!");
                break;
        }
    }


    // MARKS 3 5 2 3 4 4 3 4
    private static List<String> marks(String[] array) {
        List<String> result = new ArrayList<>();
        List<String> marks = new ArrayList<>(Arrays.asList(
                "Unsatisfactory", "Satisfactory", "Good", "Excellent"
        ));
        for (int i = 1; i < array.length; i++) {
            switch (array[i]) {
                case "0":
                case "1":
                case "2":
                    result.add(marks.get(0));
                    break;
                case "3":
                    result.add(marks.get(1));
                    break;
                case "4":
                    result.add(marks.get(2));
                    break;
                case "5":
                    result.add(marks.get(3));
                    break;
                default:
                    result.add("Unknown marks!");
                    break;
            }
        }
        return result;
    }

    // WEEK_DAYS 1 2 3 4 5 6 7
    private static List<String> weekDays(String[] array) {
        List<String> result = new ArrayList<>();
        List<String> weekDays = new ArrayList<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sunday", "Saturday"
        ));

        for (int i = 1; i < array.length; i++) {
            switch (array[i]) {
                case "1":
                    result.add(weekDays.get(0));
                    break;
                case "2":
                    result.add(weekDays.get(1));
                    break;
                case "3":
                    result.add(weekDays.get(2));
                    break;
                case "4":
                    result.add(weekDays.get(3));
                    break;
                case "5":
                    result.add(weekDays.get(4));
                    break;
                case "6":
                    result.add(weekDays.get(5));
                    break;
                case "7":
                    result.add(weekDays.get(6));
                    break;
                default:
                    result.add("There are no 8 or more days per week!");
                    break;
            }
        }
        return result;
    }

    // PLANETS 1 2 3 4 5 6 7 8 9
    private static List<String> planets(String[] array) {
        List<String> result = new ArrayList<>();
        List<String> planets = new ArrayList<>(Arrays.asList(
                "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uran", "Neptune"
        ));

        for (int i = 1; i < array.length; i++) {
            switch (array[i]) {
                case "1":
                    result.add(planets.get(0));
                    break;
                case "2":
                    result.add(planets.get(1));
                    break;
                case "3":
                    result.add(planets.get(2));
                    break;
                case "4":
                    result.add(planets.get(3));
                    break;
                case "5":
                    result.add(planets.get(4));
                    break;
                case "6":
                    result.add(planets.get(5));
                    break;
                case "7":
                    result.add(planets.get(6));
                    break;
                case "8":
                    result.add(planets.get(7));
                    break;
                default:
                    result.add("Wrong planet!");
                    break;
            }
        }
        return result;
    }
}