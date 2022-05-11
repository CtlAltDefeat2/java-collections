package student11;

public class Car implements Comparable<Car>{
    //
    //Data members
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
    public int compareTo(Car o) {
        if (this.miles>o.miles) {
            return 1;             //move up the lost
        }
        else
            return  -1;           //move down the list
    }
}
