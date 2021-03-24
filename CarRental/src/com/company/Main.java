package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a new Garage object
        Garage garage = new Garage();

        // Add cars to the Garage
        garage.addCarToGarage(new PetrolCar("BT65398", "Ford", "Mondeo", 2012, 4, 90, 19));
        garage.addCarToGarage(new PetrolCar("LM61458", "Skoda", "Fabia", 2008, 4, 95, 14));
        garage.addCarToGarage(new PetrolCar("AK41287", "Fiat", "Punto", 2019, 2, 90, 22));

        garage.addCarToGarage(new DieselCar("OP88347", "Audi", "A8", 2009, 4, 13, true));
        garage.addCarToGarage(new DieselCar("TX12982", "Mercedes", "E320", 1999, 4, 8, false));
        garage.addCarToGarage(new DieselCar("KI55327", "BMW", "M3", 2017, 4, 20, true));

        garage.addCarToGarage(new ElectricalCar("JH69874", "Tesla", "Model s", 2019, 4, 100, 200, 500));


        // Print all car stats
        garage.printAllCars();

        // Show the garage's total Green property taxes
        garage.calculateGreenPropertyTaxForAllCars();






    }
}
