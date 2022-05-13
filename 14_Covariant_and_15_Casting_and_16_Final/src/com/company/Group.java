package com.company;

import java.util.Collections;
import java.util.List;

class Group {
    private final String title;
    private final List<Student> STUDENTS;

    Group(String title, List<Student> students) {
        this.title = title;
        this.STUDENTS = Collections.unmodifiableList(students);
    }

    public String getTitle() {
        return this.title;
    }

    public List<Student> getStudents() {
        return this.STUDENTS;
    }
}