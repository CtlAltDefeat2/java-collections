package student19;

public class Car implements Comparable<Car> {
    private String Make;
    private String Model;
    private double Price;
    private String Color;
    private int Miles;

    public Car(String make, String model, Double price, String color, int miles) {
        Make = make;
        Model = model;
        Price = price;
        Color = color;
        Miles = miles;
    }

    @Override
    public String toString() {
        return
                Make + '\'' +
                 Model + '\'' +
                 Price + '\'' +
                 Color + '\'' +
                 Miles;
    }

    @Override
    public int compareTo(Car o) {
        if (this.Miles > o.Miles)
            return 1;
            else
                return -1;
            }

    public double getPrice() {
        return Price;
    }
}



