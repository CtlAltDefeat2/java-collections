package student16;

class Car implements Comparable<Car>{
   //
    private final String make;
    private final String model;
    private final double price;
    private final String color;
    private final int miles;


    //Constructors
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
    @Override
    public String toString() {
        return
                 make + '\'' +
                 model + '\'' +
                 price +
                 color + '\'' +
                 miles;

    }

    @Override
    public int compareTo(Car o) {
        if(this.miles > o.miles)
        return 1;
        else
            return -1;
    }

}
