package program;

import oop_lessons.*;

public class OOP_Lesson2 {
    public static void main(String[] args) {
        Car toyota = new Car(1000, "Toyota", 7, "White");
        Car bmw = new Car(5000, "BMW", 5, "Black");
        Car honda = new Car(3000, "Honda", 5, "Gray");

        Veichle[] parkingLot = {    
            toyota, bmw, honda
        };

        Truck teslaSemi = new Truck(10_000, "Tesla", 3, 100);
        Truck truck2 = new Truck(20_000, "Random", 4, 200);

        Veichle[] truckLot = {
            teslaSemi, truck2
        };

        for(int i = 0; i < parkingLot.length; i++) {
            System.out.println(parkingLot[i].startEngine());
            System.out.println(parkingLot[i].stopEngine());
        }

        for(int i = 0; i < truckLot.length; i++) {
            System.out.println(truckLot[i].startEngine());
            System.out.println(truckLot[i].stopEngine());
        }
    }
}
