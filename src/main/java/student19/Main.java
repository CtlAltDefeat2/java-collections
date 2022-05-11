package student19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // ex1();
        //ex2();
        //ex3();
        // ex4();
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
        // Create a class called `PersonDeDuper` that can be consumed in the following manner:
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
        Queue<Person> personQueue = new LinkedList<Person>();
        var p = personQueue;
        personQueue.add(p1);
        personQueue.add(p2);
        personQueue.add(p3);
        personQueue.add(p4);
        personQueue.add(p5);
        personQueue.add(p6);
        //var p = personQueue.remove();

        while (true) {
            System.out.println(personQueue.poll());
            if (personQueue.isEmpty())
                break;
            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Finished");
    }


    private static void ex6() {

        var car1 = new Car("Honda", "crv", 30000.0, "White", 25000);
        var car2 = new Car("BMW", "X5", 40000.0, "Red", 20000);
        var car3 = new Car("Audi", "Q5", 45000.0, "Black", 15000);
        var car4 = new Car("Infinity", "qx60", 50000.0, "Blue", 35000);
        var car5 = new Car("Nissan", "rogue", 32000.0, "Gray", 10000);
        ArrayList<Car> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        Collections.sort(carList);
        System.out.println(carList);
    }
}
