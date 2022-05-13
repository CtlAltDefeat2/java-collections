package AssignmentMay12;

public class S3BillingCalculatorObject {
    private final float storagePrice;
    private float getRequestsPrice;
    private float putRequestsPrice;

    public S3BillingCalculatorObject(float storagePrice){
        this.storagePrice = storagePrice;
    }

    public S3BillingCalculatorObject(float storagePrice, float getRequestsPrice){
        this.storagePrice = storagePrice;
        this.getRequestsPrice = getRequestsPrice;
    }

    public S3BillingCalculatorObject(S3BillingCalculatorObject s3BCObjects, float putRequestsPrice){
        this.storagePrice = s3BCObjects.storagePrice;
        this.getRequestsPrice = s3BCObjects.getRequestsPrice;
        this.putRequestsPrice = putRequestsPrice;
    }

    public float getStoragePrice(){
        return storagePrice;
    }

    public float getGetRequestsPrice(){
        return getRequestsPrice;
    }

    public float getPutRequestsPrice(){
        return putRequestsPrice;
    }
}
