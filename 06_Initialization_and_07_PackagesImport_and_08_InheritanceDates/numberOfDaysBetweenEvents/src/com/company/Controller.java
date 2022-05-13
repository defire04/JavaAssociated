package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Controller {
    static void numberOfDaysBetweenDates(Date start, Date end){
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();

        cal1.set(start.getYearEvent(), start.getMonthEvent(), start.getDateEvent());
        cal2.set(end.getYearEvent(), end.getMonthEvent(), end.getDateEvent());

        View.displayResult(calculatingTheNumberOfDaysBetweenDates(cal1.getTimeInMillis(),cal2.getTimeInMillis()));
    }


    static int calculatingTheNumberOfDaysBetweenDates(long d1, long d2){
        return (int)( (d2 - d1) / (1000 * 60 * 60 * 24) + 1);
    }
}
