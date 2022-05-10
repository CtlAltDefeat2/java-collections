package student0;

import Data.DataAccess;
import Lecture.Person;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ex5();
        // ex6();
    }

    private static void ex5() throws InterruptedException {

        var p1 = new Person("Alice", 11);
        var p2 = new Person("Bob", 22);
        var p3 = new Person("Charlie", 33);
        var p4 = new Person("Dave", 44);
        var p5 = new Person("Egar", 55);
        var p6 = new Person("Fred", 66);

        // Create queue of people here...

        while (true) {
            // Diplay contents of queue.
            // Remove first person from queue.
            // if queue is empty break from loop.

            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Finished");

    }

    private static void ex6() {



    }
}
