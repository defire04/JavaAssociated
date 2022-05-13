package com.company;

import java.util.GregorianCalendar;
import static java.util.Calendar.*;


public class Controller {

    static GregorianCalendar gc = new GregorianCalendar();

    public static void daysOfFutureBirthdays (Person person) {
        for (int i = 1; i < person.getYearsInAdvance() + 1 ; i++) {

            gc.set(YEAR, person.getYearFromWhichTheCountdownBegins() + i);
            gc.set(MONTH, person.getMonthOfBirthday() - 1);
            gc.set(DAY_OF_MONTH, person.getDateOfBirthday());

            View.displayResult(gc.get(YEAR));
            View.displayResult(dateIntToString(gc.get(DAY_OF_WEEK)));
            System.out.println("---------");
        }
    }


    static String dateIntToString(int dayOfWeekForBirth) {
        String result = "";
        switch (dayOfWeekForBirth) {
            case 7 -> result = "Saturday";
            case 2 -> result = "Monday";
            case 3 -> result = "Tuesday";
            case 4 -> result = "Wednesday";
            case 5 -> result = "Thursday";
            case 6 -> result = "Friday";
            case 1 -> result = "Sunday";
        }
        return result;
    }
}
