package com.company;
import java.util.Scanner;


public class Controller {

    public  static void display(Calendar calendar){
        System.out.println("Какой язык вы хотите?\n1 - English\n2 - Український ");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1 -> System.out.println("Mon Tue Wed Thu Fri Sat Sun");
            case 2 -> System.out.println(" Пн  Вт  Ср  Чт  Пт  Сб  Нд");
        }

        for (int i = 1; i < calendar.value; i++) {
            System.out.print("    ");
        }

        while (Calendar.date.getMonthValue() == calendar.month) {
            System.out.printf("%3d", Calendar.date.getDayOfMonth());
            if (Calendar.date.getDayOfMonth() == calendar.day) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            Calendar.date = Calendar.date.plusDays(1);
            if (Calendar.date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }

        }
        if (Calendar.date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
