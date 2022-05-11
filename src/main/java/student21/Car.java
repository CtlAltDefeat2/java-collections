package student21;

public class Car implements Comparable<Car> {

    //
    // Data Members
    //


    private String make;

    private String model;

    private float price;

    private String color;

    private float mileage;

    //
    //Constructor
    //


    public Car(String make, String model, float price, String color, float mileage) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.mileage = mileage;
    }

    //
    //Setters & Getters
    //

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    @Override
    public int compareTo(Car o) {
        var retVal = 0;

        if(this.mileage>o.mileage){
            retVal=1;
        }else if(this.mileage==o.mileage){
            retVal=0;
        }else{
            retVal=-1;
        }
        return retVal;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}' + "\n";
    }
}
