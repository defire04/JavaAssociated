package com.company;

public class Person {
    private int dateOfBirthday;
    private int monthOfBirthday;
    private int yearFromWhichTheCountdownBegins;
    private int yearsInAdvance;

    public int getDateOfBirthday() {
        return dateOfBirthday;
    }
    public int getMonthOfBirthday() {
        return monthOfBirthday;
    }
    public int getYearFromWhichTheCountdownBegins() {
        return yearFromWhichTheCountdownBegins;
    }
    public int getYearsInAdvance() {
        return yearsInAdvance;
    }

    public void setDateOfBirthday(int dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
    public void setMonthOfBirthday(int monthOfBirthday) {
        this.monthOfBirthday = monthOfBirthday;
    }
    public void setYearFromWhichTheCountdownBegins(int yearFromWhichTheCountdownBegins) {
        this.yearFromWhichTheCountdownBegins = yearFromWhichTheCountdownBegins;
    }
    public void setYearsInAdvance(int yearsInAdvance) {
        this.yearsInAdvance = yearsInAdvance;
    }

    Person(int dateOfBirthday, int monthOfBirthday, int yearFromWhichTheCountdownBegins, int yearsInAdvance) {
        this.dateOfBirthday = dateOfBirthday;
        this.monthOfBirthday = monthOfBirthday;
        this.yearFromWhichTheCountdownBegins = yearFromWhichTheCountdownBegins;
        this.yearsInAdvance = yearsInAdvance;
    }
}
