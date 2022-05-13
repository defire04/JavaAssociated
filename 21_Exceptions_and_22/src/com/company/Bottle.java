package com.company;

public class Bottle implements Comparable<Bottle> {
    private String drinkType;
    private double volume;
    private String material;

    public String getDrinkType() {
        return drinkType;
    }
    public double getVolume() {
        return volume;
    }
    public String getMaterial() {
        return material;
    }

    protected void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }
    protected void setVolume(Double volume) {
        this.volume = volume;
    }
    protected void setMaterial(String material) {
        this.material = material;
    }


    Bottle() {
    }

    Bottle(String drinkType, double volume, String material) {
        this.drinkType = drinkType;
        this.volume = volume;
        this.material = material;
    }


    @Override
    public String toString() {
        return this.drinkType + " " + this.volume + " " + this.material;
    }


    @Override
    public int compareTo(Bottle o) {
        double result = ((this.volume * 10) - (o.volume * 10)); // Умножаю на 10 потому что числа обрезаются до инта
        if (result == 0) {
            result = this.material.compareTo(o.material);
            if (result == 0) {
                result = this.drinkType.compareTo(o.drinkType);
            }
        }
        return (int)result;
    }
}
