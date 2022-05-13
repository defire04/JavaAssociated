package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
    static LocalDate date = LocalDate.now();

    int month;
    int day = date.getDayOfMonth();;
    int year;


    Calendar(){
        this.month = date.getMonthValue();
        this.year = date.getYear();
        date = date.minusDays(day - 1);
    }

    Calendar(int year, int month){
        this.month = month;
        this.year = year;
        date = LocalDate.of(this.year, this.month, this.day);
        date = date.minusDays(day - 1);
    }


    DayOfWeek weekday = date.getDayOfWeek();
    int value = weekday.getValue();

}
