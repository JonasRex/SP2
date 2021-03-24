package com.company;

public class DieselCar extends Car{
    private int kmPrL;
    private boolean hasParticleFilter;

    public DieselCar(String regNumb, String brand, String model, int year, int doors, int kmPrL, boolean hasParticleFilter) {
        super(regNumb, brand, model, year, doors);
        this.kmPrL = kmPrL;
        this.hasParticleFilter = hasParticleFilter;
    }


    @Override
    public float calculateGreenPropertyTax() {
        float tax = 0;

        if (kmPrL >= 20) {
            tax = 330+130;
        } else if (kmPrL >= 15) {
            tax = 1050+1390;
        } else if (kmPrL >= 10) {
            tax = 2340+1850;
        } else if (kmPrL >= 5) {
            tax = 5500+2770;
        } else {
            tax = 10470+15260;
        }
        if (!hasParticleFilter) tax += 1000;
        return tax;
    }

    @Override
    public String toString() {
        return "Diesel car: " + getBrand() + " " + getModel() + "(" + getYear() + ") " + getDoors()
                + " doors.Registration Number: " + getRegNumb()
                + " Green Property tax: DKK "  + calculateGreenPropertyTax();
    }
}
