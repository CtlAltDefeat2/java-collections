package student17;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;

public class Car implements Comparable<Car> {
    //
    //Data
    //
    private String make;
    private String model;
    private Float price;
    private String color;
    private int miles;
    //
    //Constructor
    //
    public Car(String make, String model, Float price, String color, int miles) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }
    Comparator<Car> priceComparator = new Comparator<Car>() {
        public int compare(Car o1, Car o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    };
    public float getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return make +
               " " + model +
               " " + price +
               " " + color +
               " " + miles;
    }
    @Override
    public int compareTo(Car c) {
        if (this.miles > c.miles) {
            return 1;
        } else if (this.miles < c.miles){
            return -1;
        }else{
            return 0;
        }
    }

}




