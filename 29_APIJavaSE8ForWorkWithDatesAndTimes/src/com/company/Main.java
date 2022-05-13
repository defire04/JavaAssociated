package com.company;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Calendar c1 = new Calendar();
        Controller.display(c1);

        Calendar c2 = new Calendar(2022, 3);
        Controller.display(c2);

//        Calendar c2 = new Calendar(2022, 3);
//        Controller.display(c2);


//        Scanner in = new Scanner(System.in);
//        LocalDate date = LocalDate.now();
//
//        System.out.println("Хотите выбрать дату? ");
//
//        String answer = in.nextLine().toLowerCase(Locale.ROOT);
//        if (answer.equals("да") || answer.equals("yes")) {
//            System.out.println("Введите год и месяц который хотите посмотреть через пробел.\nНапример 2022 1\n");
//            String [] userDate = in.nextLine().split(" ");
//
//            List<Integer> ArrDate = new ArrayList<>();
//            for (String temp : userDate){
//                ArrDate.add(Integer.parseInt(temp));
//            }
//
//            date = LocalDate.of(ArrDate.get(0), ArrDate.get(1), date.getDayOfMonth());
//        }
//
//
//        int month = date.getMonthValue();
//        int today = date.getDayOfMonth();
//
//        date = date.minusDays(today - 1);
//
//        DayOfWeek weekday = date.getDayOfWeek();
//        int value = weekday.getValue();
//
//
//        System.out.println("Какой язык вы хотите?\n1 - English\n2 - Український ");
//
//        switch (in.nextInt()) {
//            case 1 -> System.out.println("Mon Tue Wed Thu Fri Sat Sun");
//            case 2 -> System.out.println(" Пн  Вт  Ср  Чт  Пт  Сб  Нд");
//        }
//
//        for (int i = 1; i < value; i++) {
//            System.out.print("    ");
//        }
//
//        while (date.getMonthValue() == month) {
//            System.out.printf("%3d", date.getDayOfMonth());
//            if (date.getDayOfMonth() == today) {
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//            date = date.plusDays(1);
//            if (date.getDayOfWeek().getValue() == 1) {
//                System.out.println();
//            }
//
//        }
//        if (date.getDayOfWeek().getValue() != 1) {
//            System.out.println();
//        }
    }
}
