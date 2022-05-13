package com.company;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Fest> festivals = new ArrayList<>();
        festivals.add(new Fest("Atlas Weekend", "Kiev", Months.AUGUST));
        festivals.add(new Fest("Teta Tattoo Fest", "Lviv", Months.MARCH)) ;
        festivals.add(new Fest("Koktebel Jazz Festival", "Vinnytsya", Months.MAY)) ;
        festivals.add(new Fest("Atlas Weekend Bukovel", "Kiev", Months.FEBRUARY));


        Scanner in = new Scanner(System.in);
        System.out.println("1 - sort by place" + "\n" +
                           "2 - sort by month");
        System.out.print("Еnter sort type: ");
        Controller.sorting(in.next(), festivals);
        System.out.println(festivals);
    }
}
