package com.company;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Bob", "Kiev", 2007, true));
        people.add(new Person("Dima", "Kiev", 2004, true));
        people.add(new Person("Mary", "Kherson", 2000, false));
        people.add(new Person("Nastya", "Kiev", 2005, false));
        people.add(new Person("Serge", "Ivano-Frankivsk", 1999, true));
        people.add(new Person("Zhenya", "Kiev", 2003, true));

//      - при введенні “1” – по region, при однакових region: name => isMale => birthYear,
//      - при введенні “2” – по birthYear, при однакових birthYear: isMale => name => region,
//      - при введенні “3” – по isMale, при однакових isMale: name => region => birthYear,
//      - при введенні будь-якого іншого String – по name, при name => region => birthYear => isMale


        System.out.print("Enter sort type: ");
        Controller.sorting(in.next(), people);
        System.out.println(people);

    }
}
