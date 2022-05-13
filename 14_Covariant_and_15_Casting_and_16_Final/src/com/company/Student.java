package com.company;

import java.util.Collections;
import java.util.List;

class Student {
    private final String name;
    private final String group;
    private final List<Integer> marks;

    Student(String name, String numberGroup, List<Integer> marks) {
        this.name = name;
        this.group = numberGroup;
        this.marks = Collections.unmodifiableList(marks);
    }

    Student(String name, String numberGroup) {
        this.name = name;
        this.group = numberGroup;
        this.marks = null;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return this.name + " " + this.group + " " + this.marks;
    }
}