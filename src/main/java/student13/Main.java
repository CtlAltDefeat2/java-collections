package student13;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    private static void ex1() {
        var p = new Person("Tom", "Thumb", 11, "123-45-1234");
        var p1 = new Person("Jon", "Smith", 22, "123-45-1234");
        var p2 = new Person("Jon", "Smith", 22, "000-00-0000");

        if (p.equals(p1)) {
            System.out.printf("Yes \n");
        }
        if (p1.equals(p2)) {
            System.out.println("Here \n");
        }
    }

    private static void ex2() {
        var inputString = "The water main broke on water street on the day before my birthday";
        var wordCounter = new WordCounter(inputString);
        wordCounter.countWords();
        System.out.println(wordCounter.getWordCount());
    }

    private static void ex3() {
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
        var wordReverser = new WordReverser("This is a test");
        wordReverser.reverseWords();
        System.out.println(wordReverser.getReversedWords());
        System.out.println(wordReverser.getWordCount());
    }

    private static void ex5() throws InterruptedException {
        var p1 = new Person("Alice", 11);
        var p2 = new Person("Bob", 22);
        var p3 = new Person("Charlie", 33);
        var p4 = new Person("Dave", 44);
        var p5 = new Person("Egar", 55);
        var p6 = new Person("Fred", 66);

// TODO: Create queue of people here...
        Queue<Person> personQueue = new LinkedList<Person>();
        personQueue.add(p1);
        personQueue.add(p2);
        personQueue.add(p3);
        personQueue.add(p4);
        personQueue.add(p5);
        personQueue.add(p6);


        while (!personQueue.isEmpty()) {
            // TODO...
            // Display contents of queue on console.
            // Remove first person from queue.
            // if queue is empty break from loop.

            personQueue.remove(p1);
            System.out.println(personQueue);

            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Finished");
    }

    private static void ex6() {
        var c1 = new Car("Volkswagen", "Passat", 2400, "Grey", 100150);
        var c2 = new Car("Hyundai", "Sonata", 7800, "White", 58560);
        var c3 = new Car("Toyota", "Rav4", 27000, "Blue", 72790);
        var c4 = new Car("Ford", "Bronco", 25800, "Yellow", 17800);
        var c5 = new Car("Kia", "Sportage", 29500, "Black", 3000);

        var list = new ArrayList<Car>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        Collections.sort(list);
        System.out.println(list);

        Comparator<Car> priceComparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getPrice() - car2.getPrice();
            }
        };
       list.sort(priceComparator);
       System.out.println(list);
    }
}

