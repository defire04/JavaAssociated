package com.company;

public class Person implements Comparable<Person> {

    private String name;
    private String region;
    private int birthYear;
    private Boolean isMale;

    public String getName() {
        return this.name;
    }
    public String getRegion() {
        return this.region;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    public Boolean getIsMale(){
        return this.isMale;
    }

    protected void setName(String name) {
        this.name = name;
    }
    protected void setRegion(String region) {
        this.region = region;
    }
    protected void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    protected void setMale(boolean male) {
        isMale = male;
    }


    Person(String name, String region, int birthYear, boolean isMale){
        this.name = name;
        this.region = region;
        this.birthYear = birthYear;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return " \n Name = " + this.name + "," + "\n" +
                " Region = " + this.region +  "," + "\n" +
                " Birth Year = " + this.birthYear +  "," + "\n" +
                " Is male = " + this.isMale + "\n" +
                "---------------------------------------------- \n";
    }

    @Override
    public int compareTo(Person person) {
        int result = this.name.compareTo(person.name);
        if(result != 0){
            return result;
        }
        else {
            result = this.region.compareTo(person.region);
            if(result != 0){
                return result;
            }
            else {
                result = this.birthYear - person.birthYear;
                if(result != 0){
                    return result;
                }
                else {
                   return this.isMale.compareTo(person.isMale);
                }
            }
        }
    }
}


