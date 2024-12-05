package oop_lessons;

public abstract class Veichle {
    double weight;
    String manufacturer;
    int seats;

    public Veichle(double weight, String manufacturer, int seats) {
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.seats = seats;
    }

    public abstract String startEngine(); 
    public abstract String stopEngine();

}   
