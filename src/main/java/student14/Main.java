package student14;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Comparator;

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

        System.out.println("Exercise 1");
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
        System.out.println("Exercise 2");
        var inputString = "The water main broke on water street on the day before my birthday";
        var wordCounter = new WordCounter(inputString);
        wordCounter.countWords();
        System.out.println(wordCounter.getWordCount());
    }

    private static void ex3() {
        System.out.println("Exercise 3: ");
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
//        System.out.println("Exercise 4 Part A");
//        var wordReverser = new WordReverser("This is a test");
//        System.out.println(wordReverser.reverseString);
//        wordReverser.reverseWords();
//        System.out.println(wordReverser.getReversedWords());
//        System.out.println("Exercise 4 Part B");
        var wordReverser = new WordReverser("This is a test");
        wordReverser.reverseWords();
        System.out.println(wordReverser.getReversedWords());
        System.out.println(wordReverser.getWordCount());
    }

    private static void ex5() throws InterruptedException {
        System.out.println("Exercise 5");


        var p1 = new Person("Alice", 11);
        var p2 = new Person("Bob", 22);
        var p3 = new Person("Charlie", 33);
        var p4 = new Person("Dave", 44);
        var p5 = new Person("Egar", 55);
        var p6 = new Person("Fred", 66);

        // TODO: Create queue of people here...
        Queue<Person> personQueue = new LinkedList<>();
        personQueue.add(p1);
        personQueue.add(p2);
        personQueue.add(p3);
        personQueue.add(p4);
        personQueue.add(p5);
        personQueue.add(p6);

        while (!personQueue.isEmpty()) {
            // TODO...
            // Display contents of queue on console.
            System.out.println(personQueue);
            // Remove first person from queue.
            var p = personQueue.remove(p1);
            // if queue is empty break from loop.
            if (personQueue.isEmpty()) {
                TimeUnit.SECONDS.sleep(2);
            }
        }
        System.out.println("Finished");
    }

    private static void ex6() {
        System.out.println("Exercise 6");
        var c1 = new Car("Dodge", "Journey", 20800F, "White", 56543);
        var c2 = new Car("Hyundai", "Elantra SE", 22501F, "Machine Gray", 38013);
        var c3 = new Car("Honda", "Civic", 23401F, "Black", 51084);
        var c5 = new Car("Ford", "F-150", 24501F, "Silver", 63129);
        var c4 = new Car("Mazda", "Miata", 24800F, "Black", 39465);
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(c1);
        carList.add(c2);
        carList.add(c3);
        carList.add(c4);
        carList.add(c5);
        Collections.sort(carList);
        System.out.println(carList);
        Comparator<Car> priceComparator = new Comparator<Car>() {
            public int compare(Car price1, Car price2) {
                return (int) (price1.getPrice() - price2.getPrice());
            }
        };
        carList.sort(priceComparator);
        for (Car c : carList) {
            System.out.println(c);
        }
    }
}
