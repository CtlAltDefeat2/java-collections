package Lecture;

import java.util.HashMap;

public class S3BillingCalculator implements S3Calculatable {

    //
    // Data members
    //

    private final float storageCost;
    private final float getRequestsCost;
    private final float putRequestsCost;
    private final HashMap<Integer, S3BillingItem> s3BillingMap;

    //
    // Constructors
    //

    public S3BillingCalculator(float storage, float putRequests, float getRequests) {
        this.storageCost = storage;
        this.putRequestsCost = putRequests / 1000;
        this.getRequestsCost = getRequests / 1000;
        this.s3BillingMap = new HashMap<Integer, S3BillingItem>();
    }

    //
    // Public
    //

    public void addStorageGB(int userId, int amount) {
        S3BillingItem s3BillingItem;
        if (!s3BillingMap.containsKey(userId)) {
            s3BillingItem = new S3BillingItem();
            s3BillingMap.put(userId, s3BillingItem);
        } else {
           s3BillingItem = s3BillingMap.get(userId);
        }
        s3BillingItem.incrementStorage(amount);
    }

    public void addPutRequests(int userId, int number) {
        S3BillingItem s3BillingItem;
        if (!s3BillingMap.containsKey(userId)) {
            s3BillingItem = new S3BillingItem();
            s3BillingMap.put(userId, s3BillingItem);
        } else {
            s3BillingItem = s3BillingMap.get(userId);
        }
        s3BillingItem.incrementPutRequests(number);
    }

    public void addGetRequests(int userId, int number) {
        S3BillingItem s3BillingItem;
        if (!s3BillingMap.containsKey(userId)) {
            s3BillingItem = new S3BillingItem();
            s3BillingMap.put(userId, s3BillingItem);
        } else {
            s3BillingItem = s3BillingMap.get(userId);
        }
        s3BillingItem.incrementGetRequests(number);
    }

    public Invoice calculateStorageCost(int userId) {
        Invoice retval = new Invoice(userId);
        var S3BillingItem = s3BillingMap.get(userId);
        retval.setTotalStorageCost(S3BillingItem.getStorage() * storageCost);
        retval.setTotalGetRequests(S3BillingItem.getGetRequests() * getRequestsCost);
        retval.setTotalPutRequests(S3BillingItem.getPutRequests() * putRequestsCost);
        return retval;
    }
}
