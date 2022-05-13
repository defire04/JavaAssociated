package com.company;

import java.io.*;
import java.util.*;

public class Controller {
    static List<Bottle> parseFileToCollection(File file) {
        List<Bottle> result = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                List<String> temp = new ArrayList<>();
                if (!line.equals("")) { // Чтобы не проверять и не добавлять пустую строку
                    if (!line.replace(" ", "").toLowerCase().equals("nbottlevolumematerial")) { // Чтобы соблюдать формат который написан в примере исходного файла
                        for (String element : line.split(" ")) {
                            if (!element.equals("")) {
                                temp.add(element);
                            }
                        }
                        try { // Если формат файла без номеров
                            result.add(new Bottle(temp.get(0), Double.parseDouble(temp.get(1)), temp.get(2)));
                        } catch (Exception exception) {
                            result.add(new Bottle(temp.get(1), Double.parseDouble(temp.get(2)), temp.get(3)));
                        }
                    }
                }
            }
            br.close();
        } catch (IOException exception) {
            System.out.println("Read error!");
        }
        return result;
    }


    static void sortToFile(List<Bottle> listWithBottle) {
        Scanner scanner = new Scanner(System.in);
        try {
            PrintWriter pw1 = new PrintWriter("SorterFrom 0.0 - 0.5");
            PrintWriter pw2 = new PrintWriter("SorterFrom 0.51 - 1");
            PrintWriter pw3 = new PrintWriter("SorterFrom 1.0");

            System.out.println("""
                    What type of sort do you want?
                     Default - by Volume, if equal - by Material, if equal - by Bottle
                     1 - by Bottle, if equal - by Volume, if equal - by Material
                     2 - by Material, if equal - by Volume, if equal - by Bottle
                     """);
            try {
                sortBy(scanner.nextInt(), listWithBottle);
            } catch (Exception e) {
                sortBy(0, listWithBottle);
            }
            scanner.close();

            int numberBottleOnFileFirst = 1;
            int numberBottleOnFileSecond = 1;
            int numberBottleOnFileThird = 1;
            for (Bottle bottle : listWithBottle) {
                if (bottle.getVolume() < 0.51) {
                    pw1.println(numberBottleOnFileFirst++ + " " + bottle);
                } else if (bottle.getVolume() > 0.5 && bottle.getVolume() < 1.0) {
                    pw2.println(numberBottleOnFileSecond++ + " " + bottle);
                } else {
                    pw3.println(numberBottleOnFileThird++ +" " + bottle);
                }
            }
            pw1.flush();
            pw1.close();
            pw2.flush();
            pw2.close();
            pw3.flush();
            pw3.close();
            System.out.println("Recorded successfully!");
        } catch (IOException exception) {
            System.out.println("Write error!");
        }

    }


    static void sortBy(int typeOfSorting, List<Bottle> bottleList) {
        switch (typeOfSorting) {
            case 1 -> bottleList.sort(Comparator.comparing(Bottle::getDrinkType).
                    thenComparing(Bottle::getVolume).thenComparing(Bottle::getMaterial));
            case 2 -> bottleList.sort(Comparator.comparing(Bottle::getMaterial).
                    thenComparing(Bottle::getVolume).thenComparing(Bottle::getDrinkType));
            default -> Collections.sort(bottleList);
        }
    }
}
