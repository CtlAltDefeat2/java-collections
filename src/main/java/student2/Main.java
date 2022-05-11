package student2;


import java.util.*;
import java.util.concurrent.TimeUnit;

import static student2.Car.carPriceSorter;

public class Main {
    public static void main(String[] args) {
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

    private static void ex5() {

        var p1 = new Person("Alice", 11);
        var p2 = new Person("Bob", 22);
        var p3 = new Person("Charlie", 33);
        var p4 = new Person("Dave", 44);
        var p5 = new Person("Egar", 55);
        var p6 = new Person("Fred", 66);

// TODO: Create queue of people here...

        Queue<Person> q=new LinkedList<>();
        q.add(p1);
        q.add(p2);
        q.add(p3);
        q.add(p4);
        q.add(p5);
        q.add(p6);
        System.out.println(q);
        int i=0;
        while (q.size()>i) {
            // TODO...
            // Display contents of queue on console.
            // Remove first person from queue.
            // if queue is empty break from loop.
            try {
                TimeUnit.SECONDS.sleep(2);
                q.remove();
                if (q.size()==0){
                    break;
                } else System.out.println(q);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finished");
    }

    private static void ex6() {
        var c=new Car("Toyota", "Prius", 40000, "black", 115000);
        var c1=new Car("Chevy", "Equinox", 30000, "gold", 100000);
        var c2=new Car("Jaguar", "XJ6", 50000, "white", 75000);
        var c3=new Car("Acura", "MD5", 55000, "blue", 35000);
        var c4=new Car("Tesla", "Model S", 90000, "red", 350);

        List<Car> carList=new ArrayList<>();
        carList.add(c);
        carList.add(c1);
        carList.add(c2);
        carList.add(c3);
        carList.add(c4);
        Collections.sort(carList);// part a completed here
        System.out.println(carList);
        carList.sort(carPriceSorter);
        for (Car price:carList) {
            System.out.println(price);// part b completed here
            }
    }
}
