package Lecture;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // equals();
        // hashMap();

        //sets();
        stacks();
    }

    private static void sets() {
        // addAll union
        // retainAll intersection
        // unordered collection of things non-dupes
//
//        var s1 = new HashSet<String>();
//        var s2 = new HashSet<String>();
//        s1.add("1");
//        s1.add("2");
//        s1.add("3");
//
//        s2.add("3");
//        s2.add("4");
//        s2.add("5");

        //s1.addAll(s2); // Union
        //s1.retainAll(s2); // Intersection

//        System.out.println(s1);


        var p1 = new Person("Joe", 10);
        var p2 = new Person("Joe", 10);
        var p3 = new Person("Joe", 10);

        var s3 = new HashSet<Person>();
        s3.add(p1);
        s3.add(p2);
        s3.add(p3);

        System.out.println(s3);
    }

    // third dish <-- peek
    // second dish
    // first dish

    private static void stacks() {
        // push
        // pop
        // empty
        // peek
        //

        var s3BillingCalculator = new S3BillingCalculator(.10F, .25F, .50F);
        s3BillingCalculator.addStorageGB(1111, 1);
        s3BillingCalculator.addGetRequests(1111, 1000);
        s3BillingCalculator.addPutRequests(1111, 1000);

        s3BillingCalculator.addStorageGB(2222, 2);
        s3BillingCalculator.addGetRequests(2222, 2000);
        s3BillingCalculator.addPutRequests(2222, 2000);

        var invoice1 = s3BillingCalculator.createInvoice(1111);
        var invoice2 = s3BillingCalculator.createInvoice(2222);

        System.out.println(invoice1);
        System.out.println(invoice2);
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

