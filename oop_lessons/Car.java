package oop_lessons;

public class Car extends Veichle {
    String color;

    public Car(double weight, String manufacturer, int seats, String color) {
        super(weight, manufacturer, seats);
        this.color = color;
    }

    @Override
    public String startEngine() {
        return "Engine of " + manufacturer + " has started.";
    }

    @Override
    public String stopEngine() {
        return "Engine of " + manufacturer + " has stopped.";
    }
}
