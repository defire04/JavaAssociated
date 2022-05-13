package com.company;

public class Date {
    private int yearEvent;
    private int monthEvent;
    private int dateEvent;

    public int getYearEvent() {
        return yearEvent;
    }
    public int getMonthEvent() {
        return monthEvent;
    }
    public int getDateEvent() {
        return dateEvent;
    }

    public void setYearEvent(int yearEvent) {
        this.yearEvent = yearEvent;
    }
    public void setMonthEvent(int monthEvent) {
        this.monthEvent = monthEvent;
    }
    public void setDateEvent(int dateEvent) {
        this.dateEvent = dateEvent;
    }


    Date(int yearEvent, int monthEvent, int dateEvent) {
        this.yearEvent = yearEvent;
        this.monthEvent = monthEvent;
        this.dateEvent = dateEvent;
    }

    Date() {
    }
}
