package com.company;

public abstract class Car {
    private String regNumb;
    private String brand;
    private String model;
    private int year;
    private int doors;

    public Car(String regNumb, String brand, String model, int year, int doors) {
        this.regNumb = regNumb;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.doors = doors;
    }

    public abstract float calculateGreenPropertyTax();

    public String getRegNumb() {
        return regNumb;
    }

    public void setRegNumb(String regNumb) {
        this.regNumb = regNumb;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
