package Lecture;

public class S3BillingItem {

    //
    // Data members
    //

    private float storage;
    private int putRequests;
    private int getRequests;

    //
    // Constructors
    //

    public S3BillingItem() {
        this.storage = 0;
        this.putRequests = 0;
        this.getRequests = 0;
    }

    public S3BillingItem(float storage, int putRequests, int getRequests) {
        this.storage = storage;
        this.putRequests = putRequests;
        this.getRequests = getRequests;
    }

    //
    // Methods
    //

    public void incrementStorage(float storage) {
        this.storage += storage;
    }

    public void incrementPutRequests(float putRequests) {
        this.putRequests += putRequests;
    }

    public void incrementGetRequests(float getRequests) {
        this.getRequests += getRequests;
    }

    //
    // Accessors
    //

    public float getStorage() {
        return storage;
    }

    public int getPutRequests() {
        return putRequests;
    }

    public int getGetRequests() {
        return getRequests;
    }
}
