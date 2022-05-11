package student24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
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
        var p = new Person("Tom", "Thumb", 11 ,"123-45-1234");
        var p1 = new Person("Jon", "Smith", 22 , "123-45-1234");
        var p2 = new Person("Jon" , "Smith", 22 , "000-00-0000");

        if(p.equals(p1)){
            System.out.println("Yes");
        }
        if(p1.equals(p2)){
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

       var p = new Person("Alice", "Jones",11,"111-11-1111");
       var p1= new Person("Alice", "Jones",11,"111-11-1111");
       var p2 = new Person("Bob","Smith", 22 ,"222-22-2222");
       var p3 = new Person("Bob", "Smith",22,"222-22-2222");

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

        Queue<Person>personQueue = new LinkedList<Person>();
        personQueue.add(p1);
        personQueue.add(p2);
        personQueue.add(p3);
        personQueue.add(p4);
        personQueue.add(p5);
        personQueue.add(p6);

        while (true) {

            // Display contents of queue on console.
            // Remove first person from queue.
            // if queue is empty break from loop.
            System.out.println(personQueue.toString());
            personQueue.poll();
            if(personQueue.isEmpty())
                break;

            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Finished");

    }

    private static void ex6() {
        var c1= new Car("Chevy","Impala", 23000, "Silver", 30000);
        var c2 = new Car("Nissan","Altima", 29000,"Black",32000);
        var c3 = new Car("Honda", "Civic", 30000, "Blue", 1900);
        var c4 = new Car("Honda", "Accord", 10000, "Silver", 60000);
        var c5 = new Car("Hyundai", "Elantra", 25000, "Red", 29000);

         ArrayList<Car> Car = new ArrayList<Car>();
         Car.add(c1);
         Car.add(c2);
         Car.add(c3);
         Car.add(c4);
         Car.add(c5);

        Collections.sort(Car);
        System.out.println(Car);

    }
}
