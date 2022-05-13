package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {


        Integer[] array = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 0};


        Function<Integer[], List<Integer>> task_1 = earlyArray -> {
            long startTime = System.nanoTime();



            Function<List<Integer>, Double> averageSearch = list -> {
                double average = 0;
                for (Integer temp : list) {
                    average += temp;
                }
                average /= list.size() > 0 ? list.size() : 1;
                return average;
            };

            List<Integer> positive = new ArrayList<>();
            List<Integer> negative = new ArrayList<>();
            List<Integer> pair = new ArrayList<>();
            List<Integer> unpair = new ArrayList<>();

            List[] positiveAndNegative = {positive, negative};
            List[] pairAndUnpair = {pair, unpair};

            List<Integer> result = new ArrayList<>();


            for (Integer temp : earlyArray) {
                if (temp > 0) {
                    positiveAndNegative[0].add(temp);

                } else {
                    positiveAndNegative[1].add(temp);

                }
                if (temp % 2 == 0) {
                    pairAndUnpair[0].add(temp);

                } else {
                    pairAndUnpair[1].add(temp);

                }
            }

            Double[] averageArray = {
                    averageSearch.apply(positiveAndNegative[0]),
                    averageSearch.apply(positiveAndNegative[1]),
                    averageSearch.apply(pairAndUnpair[0]),
                    averageSearch.apply(pairAndUnpair[1])
            };
            Arrays.sort(averageArray);

            for (Integer temp : earlyArray) {
                if (temp > averageArray[0] && temp < averageArray[3]) {
                    result.add(temp);
                }
            }
            long finishedProgram = System.nanoTime();
            System.out.println(finishedProgram - startTime);
            return result;
        };

        System.out.println(task_1.apply(array));



    }
}









