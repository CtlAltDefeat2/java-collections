package Lecture;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // equals();
        // hashMap();

        var bc = new S3BillingCalculator(.10F, .25F, .50F);
        bc.addStorageGB(1111, 1);
        bc.addGetRequests(1111, 1000);
        bc.addPutRequests(1111, 1000);

        bc.addStorageGB(2222, 2);
        bc.addGetRequests(2222, 2000);
        bc.addPutRequests(2222, 2000);

        var invoice1 = bc.calculateStorageCost(1111);
        var invoice2 = bc.calculateStorageCost(2222);

        System.out.println(invoice1);
        System.out.println(invoice2);
    }

    private void printMessage() {

    }


    private static void hashMap() { // AKA Dictionary
        // get
        // put
        // containsKey
        // keySet
        // getOrDefault

        var p1 = new Person("joe", 22);
        var p2 = new Person("bob", 33);

        String[] list = {"one", "two", "three"};
        var wordMap = new HashMap<Integer, String>();
        for (int i = 0; i < 3; i++) {
            wordMap.put(i, list[i]);
        }
        System.out.println(wordMap.get(2));




        //System.out.println(r);
    }
}

