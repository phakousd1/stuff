package edu.canisius.csc.lsp.exam3;

public class Car implements Vehicle {
    private String make;
    private String model;
    private double totalMilesDriven;
    private double totalGallonsUsed;

    public Car(String make, String model, double totalMilesDriven, double totalGallonsUsed) {
        this.make = make;
        this.model = model;
        this.totalMilesDriven = totalMilesDriven;
        this.totalGallonsUsed = totalGallonsUsed;
    }

    public double getAverageMilesPerGallon() {
        if (totalGallonsUsed != 0) {
            return totalMilesDriven / totalGallonsUsed;
        } else {
            return 0.0;
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void incrementMileageAndGallons(int additionalMiles, int additionalGallons) {
        totalGallonsUsed = totalGallonsUsed + additionalGallons;
        totalMilesDriven = totalMilesDriven + additionalMiles;

    }

    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }

    public double getTotalGallonsUsed() {
        return totalGallonsUsed;
    }

    public static void main(String[] args) {
        Car car = new Car("Chevrolet", "Malibu", 1000, 75);
        System.out.println("MPG is: " + car.getAverageMilesPerGallon());
        System.out.println("The make is: " + car.getMake());
        System.out.println("The model of this car is: " + car.getModel());
        System.out.println("Total Miles Driven: " + car.getTotalMilesDriven());
        System.out.println("Total Gallons Used: " + car.getTotalGallonsUsed());
    }
}
