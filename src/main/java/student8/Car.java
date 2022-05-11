package student8;

import java.util.Comparator;

public class Car implements Comparable<Car> {


    String make;
    String model;
    int price;
    String color;
    int miles;


    Car(String make, String model, int price, String color, int miles) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        System.out.println(make + miles);
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                //", color='" + color + '\'' +
                //", miles=" + miles +
                '}';
    }
}
