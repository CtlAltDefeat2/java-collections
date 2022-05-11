package student23;

import java.util.Queue;

public class Car implements Comparable<Car> {
    String make = "";
    String model = "";
    double price = 0.00;
    String color = "";
    double milesPerGallon = 0.00;

    public Car(String make, String model, double price, String color, double milesPerGallon) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.milesPerGallon = milesPerGallon;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Car car) {

        if (this.milesPerGallon > car.milesPerGallon) {
            // if current object is greater,then return 1
            return 1;
        }
        else if (this.milesPerGallon < car.milesPerGallon) {
            // if current object is greater,then return -1
            return -1;
        }
        else {
            // if current object is equal to o,then return 0
            return 0;
        }
    }
}
