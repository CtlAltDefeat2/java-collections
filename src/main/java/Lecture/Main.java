package Lecture;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // equals();
        // hashMap();

        //sets();
        //stacks();
        //queues();
        sort();
    }

    private static void queues() {
        // add
        // remove
        // poll
        // peek
        // contains

        var p1 = new Person("Joe", 11);
        var p2 = new Person("Joe", 22);
        var p3 = new Person("Joe", 33);

        Queue<Person> personQueue = new LinkedList<Person>();
        personQueue.add(p1);
        personQueue.add(p2);
        personQueue.add(p3);

        var p =  personQueue.peek();
        System.out.println(p);
        personQueue.remove();
        personQueue.poll();

        System.out.println(personQueue);
    }

    private static void sort() {
        var p1 = new Person("Joe", 11);
        var p2 = new Person("Joe", 10);
        var p3 = new Person("Joe", 13);
        var p4 = new Person("Joe", 3);

        var list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Collections.sort(list);
        System.out.println(list);
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

