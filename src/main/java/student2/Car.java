package student2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String make, model, color;
    private int miles;
    private float price;
    NumberFormat cashFormat = NumberFormat.getCurrencyInstance();

    public Car(String make, String model, float price, String color, int miles) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.miles = miles;
    }
    public String getMake(){
        return make;
    }
    public float getPrice(){
        return Float.parseFloat(cashFormat.format(price));
    }
    public static Comparator<Car> carPriceSorter=new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            Float carPrice1= o1.price;
            Float carPrice2=o2.price;
            return carPrice1.compareTo(carPrice2);
        }
    };

    @Override
    public String toString() {
        return "\n" + make + " " + model + ", " + color + '\n' +
                miles + "\n" +
                cashFormat.format(price);
    }

    public int getMiles() {
        return miles;
    }

    @Override
    public int compareTo(Car o) {
        int compareMileage=((Car)o).miles;
        return this.miles-compareMileage;
    }
}
