package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> dimasMarks = new ArrayList<>(Arrays.asList(2,5));
        List<Integer> bobMarks = new ArrayList<>(Arrays.asList(2,5));
        List<Integer> sashasMarks = new ArrayList<>(Arrays.asList(2,5));

        final Student dima = new Student("Dima", "ПД-14", dimasMarks);
        final Student tanya = new Student("Bob", "ПД-14", bobMarks);
        final Student sasha = new Student("Sasha", "ПД-14", sashasMarks);

        List<Student> listPd14 = new ArrayList<>();

        listPd14.add(dima);
        listPd14.add(tanya);
        listPd14.add(sasha);
        listPd14 = Collections.unmodifiableList(listPd14);
        dimasMarks = Collections.unmodifiableList(dimasMarks);
        bobMarks = Collections.unmodifiableList(bobMarks);
        sashasMarks = Collections.unmodifiableList(sashasMarks);

        final Group pd14 = new Group("PD-14", listPd14);

        System.out.println(pd14.getTitle());
        System.out.println(pd14.getStudents());
    }
}






