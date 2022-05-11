package student12;

import java.util.ArrayList;
import java.util.Comparator;

public class Car implements Comparable<Car> {
    //
    //Data Members
    //
    private String make;
    private String model;
    private float price;
    private String color;
    private int miles;
    private ArrayList<Car> cars = new ArrayList<>();



    //
    //Constructors
    //
    Car(){

    }
    Car(String make, String model, float price, String color, int miles){
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;

    }



    //
    //Methods
    //

    public void add(Car car){
        this.cars.add(car);
    }



    //
    //Overrides
    //

    @Override
    public int compareTo(Car car) {
        return 0;
    }

    @Override
    public String toString() {
        return "\n" + make + " " + model + " " + price
                + " " + color + " " + miles ;
    }

    //
    //Accessors
    //


    public int getMiles() {
        return miles;
    }
}
