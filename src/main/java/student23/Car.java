package student23;

import java.util.Queue;

public class Car implements Comparable<Car> {
    String Make = "";
    String Model = "";
    double Price = 0.00;
    String Color = "";
    double MilesPerGallon = 0.00;

    public Car(String make, String model, double price, String color, double milesPerGallon) {
        Make = make;
        Model = model;
        Price = price;
        Color = color;
        MilesPerGallon = milesPerGallon;
    }

    public double getPrice() {
        return Price;
    }

    @Override
    public int compareTo(Car car) {

        if (this.MilesPerGallon > car.MilesPerGallon) {
            // if current object is greater,then return 1
            return 1;
        }
        else if (this.MilesPerGallon < car.MilesPerGallon) {
            // if current object is greater,then return -1
            return -1;
        }
        else {
            // if current object is equal to o,then return 0
            return 0;
        }
    }
}
