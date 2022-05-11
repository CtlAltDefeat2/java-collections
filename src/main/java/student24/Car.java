package student24;

import java.util.ArrayList;
import java.util.Comparator;

public class Car implements Comparable<Car>{
    //ArrayList<Car> Car= new ArrayList<>();
    private String make;
    private String model;
    private double price;
    private String color;
    private int miles;

    public Car(String make, String model, double price, String color, int miles) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getMiles() {
        return miles;
    }

    public static String presentation(ArrayList<Car> list) {
        String retval = "";
        for(Car c : list) {
            retval += (c.make + "  "+  c.model + "  "+  c.color + "  "+  c.price +"  "+ c.miles+"\n");
        }
        return retval;
    }

    @Override
    public String toString() {
        return  make + "  " +
                model +  " " +
                 price + " "+
                 color + " " +
                 miles;
    }


    @Override
    public int compareTo(Car o) {
        if(this.miles>o.miles)
            return 1;
        else
            return -1;
    }


}
