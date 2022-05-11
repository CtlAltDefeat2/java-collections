package student14;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable<Car> {


    //data members
    private String make;
    private String model;
    private Float price;
    private String color;
    private Integer miles;


    //constructors


//    public Car(Comparator<Car> mileageComparator) {
//        this.mileageComparator = mileageComparator;
//    }


    public Car(String make, String model, Float price, String color, Integer miles) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }


    //getters

    public Float getPrice() {
        return price;
    }

    public Integer getMiles() {
        return miles;
    }

    //methods

    //overrides
//    @Override
//    public Comparator<Car> mileageComparator = new Comparator<Car>() {
//        @Override
//        public int compare(Car c1, Car c2) {
//            return c1.getMiles() - c2.getMiles();
//        }
//    };

    @Override
    public String toString() {
        return make + '\'' +
                model + '\'' +
                price +
                color + '\'' +
                miles;
    }

    @Override
    public int compareTo(Car o) {
        int retVal = 0;
        if (this.miles>o.miles){
            retVal = 1;
        } else{
            retVal = -1;
        }
        return retVal;
    }
}