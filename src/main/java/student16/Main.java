package student16;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static java.awt.Color.yellow;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //ex1();
        //ex2();
        //ex3();
        //ex4( );
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
        int countWords = 0;
        var wordCounter = new WordCounter(inputString);
        wordCounter.countWords( );
        System.out.println(wordCounter.getWordCount( ));
    }

    private static void ex3() {
        var p = new Person("Alice", "Jones", 11, "111-11-1111");
        var p1 = new Person("Alice", "Jones", 11, "111-11-1111");
        var p2 = new Person("Bob", "Smith", 22, "222-22-2222");
        var p3 = new Person("Bob", "Smith", 22, "222-22-2222");

        var personDeDuper = new PersonDeDuper( );
        personDeDuper.addPerson(p);
        personDeDuper.addPerson(p1);
        personDeDuper.addPerson(p2);
        personDeDuper.addPerson(p3);

        System.out.println(personDeDuper.getUniquePeople( ));
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
        var p5 = new Person("Edgar", 55);
        var p6 = new Person("Fred", 66);
        // TODO: Create queue of people here...
        Queue<Person> Queue = new LinkedList<>( );
        Queue.add(p1);
        Queue.add(p2);
        Queue.add(p3);
        Queue.add(p4);
        Queue.add(p5);
        Queue.add(p6);
        // TODO...
        // Display contents of queue on console.
        // Remove first person from queue.
        // if queue is empty break from loop.

        while (true) {
            System.out.println(Queue);
            Queue.poll( );
            if(Queue.isEmpty())
                break;
            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Finished");
   }

    private static void ex6() {

        var c1 = new Car ( "Ford", "Mustang", 50_000, "yellow", 1000);
        var c2 = new Car ("RollsRoyce", "Wrath", 330_000,"black", 110);
        var c3 = new Car ("maserati","granTurismo", 300_000, "blue", 1100);
        var c4 = new Car ( "Dodge", "Challenger", 140_000, "white", 46);
        var c5 = new Car ("Chevy", "Stingray",65_000, "red", 1500);
        ArrayList <Car> carList = new ArrayList<>(  );
        carList.add(c1);
        carList.add(c2);
        carList.add(c3);
        carList.add(c4);
        carList.add(c5);
        Collections.sort(carList);
        System.out.println(carList );
        Comparator<Car> carComparator = new Comparator<Car>() {
            public int compare(Car c1, Car c2) {
                return (int) (c1.getPrice() - c2.getPrice());
            }
        };
        carList.sort(carComparator);
        System.out.println(carList);;
    }

}

