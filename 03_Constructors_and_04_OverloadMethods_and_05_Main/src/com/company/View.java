package com.company;

import java.util.List;

public class View {

     static void printForUser(List<String> ls) {
        for(String temp : ls ){
            System.out.println(temp);
        }
        System.out.println("-----------------------");
    }
}
