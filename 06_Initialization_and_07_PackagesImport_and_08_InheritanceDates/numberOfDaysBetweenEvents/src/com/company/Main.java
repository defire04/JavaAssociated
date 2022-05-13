package com.company;

public class Main {
    public static void main(String[] args){
        Date startEvent = new Date(1939, 10,1);
        Date endEvent = new Date(1945, 10,2);
        Controller.numberOfDaysBetweenDates(startEvent, endEvent);
    }

}