package com.company;

public class PetrolCar extends Car{
    private int octaneLevel;
    private int kmPrL;

    public PetrolCar(String regNumb, String brand, String model, int year, int doors, int octaneLevel, int kmPrL) {
        super(regNumb, brand, model, year, doors);
        this.octaneLevel = octaneLevel;
        this.kmPrL = kmPrL;
    }



    @Override
    public float calculateGreenPropertyTax() {
        if (kmPrL >= 20) {
            return 330;
        } else if (kmPrL >= 15) {
            return 1050;
        } else if (kmPrL >= 10) {
            return 2340;
        } else if (kmPrL >= 5) {
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return "Petrol car: " + getBrand() + " " + getModel() + "(" + getYear() + ") " + getDoors()
                + " doors.Registration Number: " + getRegNumb()
                + " Green Property tax: DKK "  + calculateGreenPropertyTax();
    }
}
