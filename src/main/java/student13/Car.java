package student13;

import java.util.PrimitiveIterator;

public class Car implements Comparable<Car>{
    // data members

    private String make;
    private String model;
    private int price;
    private String color;
    private float miles;

    // constructors

    Car(String make, String model, int price, String color, float miles){
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public int getPrice() {
        return price;
    }
// methods

    @Override
    public int compareTo(Car c) {
        int retVal = 0;
        if (this.miles > c.miles){
            retVal = 1;
        } else {
            retVal = -1;
        }
        return retVal;
    }

    @Override
    public String toString() {
        return   make + "\t" + model + "\t" +
                 price + "\t" +
                 color + "\t" +
                 miles + "\n";
    }
}
