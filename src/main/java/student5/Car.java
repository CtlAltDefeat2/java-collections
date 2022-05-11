package student5;

import java.util.ArrayList;

public class Car implements Comparable<Car> {
    // Variable Declarations
    private int year;
    private String make;
    private String model;
    private float price;
    private String color;
    private int miles;
    private static ArrayList<Car> carList = new ArrayList<>();

    // Constructors
    public Car(int year, String make, String model, float price, String color, int miles) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    // Accessors
    public float getPrice() {
        return price;
    }

    // Overrides
    @Override
    public String toString() {
        return year + " " + make + " " + model + " $" + price + " " + color + " " + miles + " miles";
    }
    @Override
    public int compareTo(Car car) {
        int returnValue;
        if (this.miles > car.miles) {
            returnValue = 1;
        } else if (this.miles < car.miles) {
            returnValue = -1;
        } else returnValue = 0;
        return returnValue;
    }
}
