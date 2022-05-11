package student12;

import java.util.ArrayList;
import java.util.Comparator;
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
        System.out.println("Ex 1.)");
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
        System.out.println("\nEx 2.)");
        var inputString = "The water main broke on water street on the day before my birthday";
        var wordCounter = new WordCounter(inputString);
        wordCounter.countWords();
        System.out.println(wordCounter.getWordCount());
    }

    private static void ex3() {
        System.out.println("Ex 3.)");
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
        System.out.println("Ex 4.)");
        var wordReverser = new WordReverser("This is a test");
        wordReverser.reverseWords();
        System.out.println(wordReverser.getReversedWords());
        System.out.println(wordReverser.getWordCount());
    }

    private static void ex5() throws InterruptedException {
        System.out.println("Ex 5.)");
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
        System.out.println(personQueue);


        while (!personQueue.isEmpty()) {
            // TODO...
            // Display contents of queue on console.
            // Remove first person from queue.
            // if queue is empty break from loop.
            personQueue.remove();
            System.out.println(personQueue);

            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Finished");
    }


    private static void ex6() {
        System.out.println("Ex 6.)");
        var cars = new ArrayList<Car>();
        cars.add(new Car("Ford", "Fusion", 20_000, "grey", 10_000));
        cars.add(new Car("Chevy", "Silverado", 50_000, "red", 1_500));
        cars.add(new Car("Toyota", "Prius", 32_500, "blue", 658));
        cars.add(new Car("Mazda", "Mazda6", 65_000, "white", 18_000));
        cars.add(new Car("Honda", "Civic", 85_562, "orange", 150_000));
        cars.sort(Car::compareTo);
        System.out.println("Sorted by Mileage");
        for (Car c : cars){
            System.out.println(c);
        }
        Comparator<Car> priceComparator = new Comparator<Car>() {
            public int compare(Car c1, Car c2) {
                return c1.getPrice() - c2.getPrice();
            }
        };
        System.out.println("Sorted by price");
        cars.sort(priceComparator);
        for (Car c : cars){
            System.out.println(c);
        }




    }
}

