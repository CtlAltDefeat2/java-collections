package AssignmentMay12;

import java.util.HashMap;

public class S3BillingCalculator implements S3Calculatable {

    private final float pricePerGB;
    private final float costPer1PutRequests;
    private final float costPer1GetRequests;
    private final static int noOfRequestsUsedToEstimateCost = 1000;

    HashMap<Integer, S3BillingCalculatorObject> s3HashMap = new HashMap<>();
    S3BillingCalculatorObject s3BCObject;

    public S3BillingCalculator(float pricePerGB, float costPer1000PutRequests, float costPer1000GetRequests) {
        this.pricePerGB = pricePerGB;
        this.costPer1PutRequests = costPer1000PutRequests/noOfRequestsUsedToEstimateCost;
        this.costPer1GetRequests = costPer1000GetRequests/noOfRequestsUsedToEstimateCost;
    }

    public void addStorageGB(int userID, int storage) {
        float storagePrice = storage * pricePerGB;
        s3BCObject = new S3BillingCalculatorObject(storagePrice);
        s3HashMap.put(userID, s3BCObject);
    }
    @Override
    public void addGetRequests(int userID, int number) {
        float getRequestsPrice = number * costPer1GetRequests;
        s3BCObject = new S3BillingCalculatorObject(s3BCObject.getStoragePrice(), getRequestsPrice);
        s3HashMap.put(userID, s3BCObject);
    }
    @Override
    public void addPutRequests(int userID, int number) {
        float putRequestsPrice = (number * costPer1PutRequests);
        s3BCObject = new S3BillingCalculatorObject(s3HashMap.get(userID), putRequestsPrice);
        s3HashMap.put(userID, s3BCObject);
    }
    @Override
    public Invoice createInvoice(int userId) {
        return new Invoice(userId, s3HashMap.get(userId));
    }
}
