package Data;

public class Guitar {

    private String model;
    private String manufacturer;
    private float cost;

    public Guitar(String model, String manufacturer, float cost) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return manufacturer + " " + model + " " + cost;
    }
}
