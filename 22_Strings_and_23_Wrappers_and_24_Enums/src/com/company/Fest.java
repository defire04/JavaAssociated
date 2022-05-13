package com.company;

public class Fest implements Comparable<Fest> {
    private String name;
    private String place;
    private Months month;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }

    public Months getMonth() {
        return month;
    }
    public void setMonth(Months month) {
        this.month = month;
    }

    public Fest(String name, String place, Months month) {
        this.name = name;
        this.place = place;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Name of festival = " + name + '\n' +
                "Place of the festival = " + place + '\n' +
                "Behavior Month = " + month + '\n' +
                "---------------------------------" + '\n';
    }

    @Override
    public int compareTo(Fest fest) {
      return this.name.compareTo(fest.name);
    }
}
