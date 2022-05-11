package student25;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements Comparable <Car> {
    private String make;
    private String model;
    private float price;
    private String color;
    private int miles;
    // private final ArrayList<Car> carList = new ArrayList<>();


    public Car(String make, String model, float price, String color, int miles) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }

    @Override
    public int compareTo(Car c) {
        int retVal = 0;
        if (this.miles > c.miles) {
            retVal = -1;
        } else {
            retVal = 1;
        }
        return retVal;
    }
}
