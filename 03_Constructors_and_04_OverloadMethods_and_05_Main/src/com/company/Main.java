package com.company;

public class Main {

    public static void main(String[] args) {

        /*
         * Для удобства можно менять тут, а не в конфигурации
         */
        args = "MARKS 3 5 2 3 4 4 3 4".split("\s");
        Model m1 = new Model(args);
        Controller.launcher(m1);


        args = "WEEK_DAYS 1 2 3 4 5 6 7 8".split("\s");
        Model m2 = new Model(args);
        Controller.launcher(m2);
    }
}
