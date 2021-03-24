package com.company;

import java.util.ArrayList;

public class Garage {
    ArrayList<Car> garage;

    public Garage() {
        garage = new ArrayList<>();
    }

    public void addCarToGarage(Car car) {
        garage.add(car);
    }

    public void calculateGreenPropertyTaxForAllCars() {
        float totalTax = 0;
        for ( Car c : garage) {
            totalTax += c.calculateGreenPropertyTax();
        }
        System.out.println("\nThe total amount of green property tax for the whole garage is: DKK " +totalTax);
    }

    public void printAllCars() {
        for (Car c : garage) {
            System.out.println(c);
        }
    }
}
