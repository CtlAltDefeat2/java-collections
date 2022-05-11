package student7;

public class Car implements Comparable<Car>{
    private String make;
    private String model;
    private float price;
    private String color;
    private int miles;

    public Car(String make, String model, float price, String color, int miles) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public float getPrice() {
        return price;
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
        if(this.miles > o.miles)
            return 1;
        else
            return -1;
    }


}
