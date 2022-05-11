package student8;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        ex6();
    }

    private static void ex1() {
        var p = new Person("Tom", "Thumb", 11, "123-45-1234");
        var p1 = new Person("Jon", "Smith", 22, "123-45-1234");
        var p2 = new Person("Jon", "Smith", 22, "000-00-0000");

        if (p.equals(p1)) {
            System.out.printf("Yes");
        }
        if (p1.equals(p2)) {
            System.out.println("Here");
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

        Queue<Person> peopleQueue = new LinkedList<Person>();
        peopleQueue.add(p1);
        peopleQueue.add(p2);
        peopleQueue.add(p3);
        peopleQueue.add(p4);
        peopleQueue.add(p5);
        peopleQueue.add(p6);

        while (true) {
            // TODO...
            // Display contents of queue on console.
            System.out.println(peopleQueue.toString());
            // Remove first person from queue.
            peopleQueue.remove();
            // if queue is empty break from loop.
            if (peopleQueue.isEmpty()) {
                break;
            }

            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Finished");
    }

    private static void ex6() {
        ArrayList<Car> cars = new ArrayList<Car>();
        var c1 = new Car("McLaren ", "570S Spider", 200000, "blue", 10000);
        var c2 = new Car("Ferrari ", "488 Spider", 400000, "red", 30000);
        var c3 = new Car("Lamborghini ", "Aventador", 500000, "black", 20000);
        var c4 = new Car("Ford ", "GT", 1000000, "white", 25000);
        var c5 = new Car("Porsche ", "911", 200000, "silver", 15000);

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);

        for (int i = 0; i < cars.size()-1; i++) {
            cars.get(i).compareTo(cars.get(i+1));
            System.out.println(i);
        }

        Comparator<Car> priceComparator = Comparator.comparing(Car::getPrice);

        Collections.sort(cars, priceComparator);

        System.out.println(cars);
    }
}
