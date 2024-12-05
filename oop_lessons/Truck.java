package oop_lessons;

public class Truck extends Veichle {
    int cargoCount;

    public Truck(double weight, String manufactuer, int seats, int cargoCount) {
        super(weight, manufactuer, seats);
        this.cargoCount = cargoCount;
    }

    @Override
    public String startEngine() {
        return "Truck " + manufacturer + " has started.";
    }

    @Override
    public String stopEngine() {
        return "Truck " + manufacturer + " has stopped.";
    }
}   
