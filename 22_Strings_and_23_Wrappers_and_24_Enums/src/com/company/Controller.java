package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Controller {
    public static void sorting(String typeOfSorting, List<Fest> fest) {

        switch (typeOfSorting) {
            case "1":
                fest.sort(new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        return ((Fest) o1).getPlace().compareTo(((Fest) o2).getPlace());
                    }
                });
                break;
            case "2":
                fest.sort(new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        return ((Fest) o1).getMonth().compareTo(((Fest) o2).getMonth());
                    }
                });
                break;
            default:
                Collections.sort(fest);
                break;
        }
    }
}
