package Lecture;

public interface S3Calculatable {

    void addStorageGB(int userId, int amount);

    void addPutRequests(int userId, int number);

    void addGetRequests(int userId, int number);

    Invoice calculateStorageCost(int userId);
}
