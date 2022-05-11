package student20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Car implements  Comparable <Car>{

    private String make;
    private String model;
    private int price;
    private String color;
    private int miles;
    private ArrayList <Car> carlist = new ArrayList<Car>();


    public Car(){}
    public Car(String make, String model, int price, String color, int miles) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car:" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '\n';
    }


    @Override
    public int compareTo(Car o) {

        int retval= 0;
        if (this.miles >o.miles) {
            retval = 1;
        }
        else {
            retval=-1;
        }

        return retval;
    }
}