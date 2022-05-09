package Lecture;

import java.text.NumberFormat;

public class Invoice {

    //
    // Data members
    //

    private int userId;
    private float totalStorageCost;
    private float totalGetRequests;
    private float totalPutRequests;
    private NumberFormat formatter = NumberFormat.getCurrencyInstance();

    //
    // Constructors
    //

    public Invoice(int userId) {
        this.userId = userId;
    }

    public Invoice(float totalStorageCost, float totalGetRequests, float totalPutRequests) {
        this.totalStorageCost = totalStorageCost;
        this.totalGetRequests = totalGetRequests;
        this.totalPutRequests = totalPutRequests;
    }

    //
    // Accessors
    //

    public void setTotalStorageCost(float totalStorageCost) {
        this.totalStorageCost = totalStorageCost;
    }

    public void setTotalGetRequests(float totalGetRequests) {
        this.totalGetRequests = totalGetRequests;
    }

    public void setTotalPutRequests(float totalPutRequests) {
        this.totalPutRequests = totalPutRequests;
    }

    //
    // Private
    //

    private float getTotalInvoiceCost() {
        return totalStorageCost + totalGetRequests + totalPutRequests;
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        return  "UserId: " + userId + "\n" +
                "Storage: " + formatter.format(totalStorageCost) + "\n" +
                "GET Requests: " + formatter.format(totalGetRequests) + "\n" +
                "PUT Requests: " + formatter.format(totalPutRequests) + "\n" +
                "Total Cost: " + formatter.format(getTotalInvoiceCost()) + "\n";
    }
}
