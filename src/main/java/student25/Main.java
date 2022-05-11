package student25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class Main { // Wendy
    public static void main(String[] args) throws InterruptedException {
        // ex1();
        //  ex2();
        //  ex3();
        //  ex4();
        //ex5();
        ex6();
    }

    private static void ex1() {
        // Create a Person class that can be consumed in the following manner:
        var p = new Person("Tom", "Thumb", 11, "123-45-1234");
        var p1 = new Person("Jon", "Smith", 22, "123-45-1234");
        var p2 = new Person("Jon", "Smith", 22, "000-00-0000");
        if (p.equals(p1)) {
            System.out.print("Yes");
        }
        if (p1.equals(p2)) {
            System.out.println("Here");
        }
    }

    private static void ex2() {
        // Create a class called WordCounter that can be consumed in this manner:

        var inputString = "The water main broke on water street on the day before my birthday";
        var wordCounter = new WordCounter(inputString);
        wordCounter.countWords();
        System.out.println(wordCounter.getWordCount());
    }

    private static void ex3() {
        // Create a class called PersonDeDuper that can be consumed in the following manner:

        var p = new Person("Alice", "Jones", 11, "111-11-1111");
        var p1 = new Person("Alice", "Jones", 11, "111-11-1111");
        var p2 = new Person("Bob", "Smith", 22, "222-22-2222");
        var p3 = new Person("Bob", "Smith", 22, "222-22-2222");

        var personDeDuper = new PersonDeDuper();
        personDeDuper.addPerson(p);
        personDeDuper.addPerson(p1);
        personDeDuper.addPerson(p2);
        personDeDuper.addPerson(p3);

        System.out.println(personDeDuper.getUniquePeople());
    }

    private static void ex4() {

        // Create a class called WordReverser that can be consumed in the following manner:

        var wordReverser = new WordReverser("This is a test");
        wordReverser.reverseWords();
        System.out.println(wordReverser.getReversedWords());
        System.out.println(wordReverser.getWordCount());
    }

    private static void ex5() throws InterruptedException {
        // Given the following code, implement the TODOs...
        var p1 = new Person("Alice", 11);
        var p2 = new Person("Bob", 22);
        var p3 = new Person("Charlie", 33);
        var p4 = new Person("Dave", 44);
        var p5 = new Person("Edgar", 55);
        var p6 = new Person("Fred", 66);

        // TODO: Create queue of people here...
        Queue<Person> personQueue = new LinkedList<Person>();
        personQueue.add(p1);
        personQueue.add(p2);
        personQueue.add(p3);
        personQueue.add(p4);
        personQueue.add(p5);
        personQueue.add(p6);
        // TODO..
        while (!personQueue.isEmpty()) {
            // Display contents of queue on console.
            System.out.println(personQueue);
            // Remove first person from queue.
            var p = personQueue.remove(); //dequeue
            System.out.println(p);
            // if queue is empty break from loop.
            if (personQueue.isEmpty()) {
                TimeUnit.SECONDS.sleep(2);
            }
        }
        System.out.println("Finished");
    }


        private static void ex6() {
           var c1 = new Car("Tesla","ROADSTER",10000.0f,"black",200000);
           var c2 = new Car("Chevrolet","EXPRESS 4500",15000.0f, "grey",150000);
           var c3 = new Car("Ford","Escape",12000.0f,"white",80000);
           var c4 = new Car("KIA","Sorento",22000.0f,"red",50000);

            ArrayList<Car> carList = new ArrayList<>();
            carList.add(c1);
            carList.add(c2);
            carList.add(c3);
            carList.add(c4);
            Collections.sort(carList);
            System.out.println(carList);
        }
    }


