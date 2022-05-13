package com.company;

import java.util.List;
import java.util.Objects;


public class Car {
    private String model;
    private String owner;
    private int price;
    private int produceYear;

    Car() {
    }

    Car(String model, String owner, int price, int produceYear) {
        this.model = model;
        this.owner = owner;
        this.price = price;
        this.produceYear = produceYear;
    }


    public String getModel() {
        return model;
    }
    public String getOwner() {
        return owner;
    }
    public int getPrice() {
        return price;
    }
    public int getProduceYear() {
        return produceYear;
    }

    protected void setModel(String model) {
        this.model = model;
    }
    protected void setOwner(String owner) {
        this.owner = owner;
    }
    protected void setPrice(int price) {
        this.price = price;
    }
    protected void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }


    /**
     * Нестандартные методы для поиска в классе Car
     */
    public boolean findCarByField(List<Car> lsCar, String fieldForFind) {
        boolean result = false;

        switch (fieldForFind) {
            case "model" -> {
                for (Car temp : lsCar) {
                    result = this.getModel().equals(temp.getModel());
                    if (result) {
                        break;
                    }
                }
            }
            case "price" -> {
                for (Car temp : lsCar) {
                    result = Objects.equals(temp.getPrice(), this.getPrice());
                    if (result) {
                        break;
                    }
                }
            }
            case "produceYear" -> {
                for (Car temp : lsCar) {
                    result = temp.getProduceYear() == this.getProduceYear();
                    if (result) {
                        break;
                    }
                }
            }
            case "owner" -> {
                result = lsCar.contains(this);
            }
            default -> {
                return false;
            }
        }
        return result;

    }


    /**
     * Стандартные методы поиска
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(this.owner, car.owner);
    }


    @Override
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = result + (owner == null ? 0 : owner.hashCode());
        result = 17 * result + price;
        result = 17 * result + produceYear;
        return result;
    }
}

