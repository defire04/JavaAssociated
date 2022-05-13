package com.company;

import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Controller {
    public static void sorting(String typeOfSorting, List<Person> people) {
        switch (typeOfSorting) {
            case "1" -> people.sort(new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    int result = ((Person) o1).getRegion().compareTo(((Person) o2).getRegion());
                    if (result != 0) {
                        return result;
                    } else {
                        result = ((Person) o1).getName().compareTo(((Person) o2).getName());
                        if (result != 0) {
                            return result;
                        } else {
                            result = ((Person) o1).getIsMale().compareTo(((Person) o2).getIsMale());
                            if (result != 0) {
                                return result;
                            } else {
                                return ((Person) o1).getBirthYear() - ((Person) o2).getBirthYear();
                            }
                        }
                    }
                }
            });
            case "2" -> people.sort(new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    int result = ((Person) o1).getBirthYear() - ((Person) o2).getBirthYear();
                    if (result != 0) {
                        return result;
                    } else {
                        result = ((Person) o1).getIsMale().compareTo(((Person) o2).getIsMale());
                        if (result != 0) {
                            return result;
                        } else {
                            result = ((Person) o1).getName().compareTo(((Person) o2).getName());
                            if (result != 0) {
                                return result;
                            } else {
                                return ((Person) o1).getRegion().compareTo(((Person) o2).getRegion());
                            }
                        }
                    }
                }
            });
            case "3" -> people.sort(new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    int result = ((Person) o1).getIsMale().compareTo(((Person) o2).getIsMale());
                    if (result != 0) {
                        return result;
                    } else {
                        result = ((Person) o1).getName().compareTo(((Person) o2).getName());
                        if (result != 0) {
                            return result;
                        } else {
                            result = ((Person) o1).getRegion().compareTo(((Person) o2).getRegion());
                            if (result != 0) {
                                return result;
                            } else {
                                return ((Person) o1).getBirthYear() - ((Person) o2).getBirthYear();
                            }
                        }
                    }
                }
            });
            default -> Collections.sort(people);
        }
    }
}
