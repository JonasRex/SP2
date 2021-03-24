package com.company;

public class ElectricalCar extends Car{
    private int batteryCapacityKWh;
    private int maxKm;
    private float whPrKm;

    public ElectricalCar(String regNumb, String brand, String model, int year, int doors, int batteryCapacityKWh, int maxKm, float whPrKm) {
        super(regNumb, brand, model, year, doors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this. whPrKm = whPrKm;

    }

    @Override
    public float calculateGreenPropertyTax() {
        float kmPrL = convertWhToKm(whPrKm);
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

    public float convertWhToKm(float whPrKm) {
        return (float) (100 / (whPrKm / 91.25));
    }

    @Override
    public String toString() {
        return "Electrical car: " + getBrand() + " " + getModel() + "(" + getYear() + ") " + getDoors()
                + " doors.Registration Number: " + getRegNumb()
                + " Green Property tax: DKK "  + calculateGreenPropertyTax();
    }
}
