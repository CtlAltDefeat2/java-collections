package student1;

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

            //System.out.println("TODO...");
        }
    }
        private static void ex2 () {

            var inputString = "The water main broke on water street on the day before my birthday";
            var wordCounter = new WordCounter(inputString);
            wordCounter.countWords();
            System.out.println(wordCounter.getWordCount());

           // System.out.println("TODO...");
        }

        private static void ex3 () {
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

        private static void ex4 () {
            WordReverser wordReverser = new WordReverser("This is a test");
            wordReverser.reverseWords();
            System.out.println(wordReverser.getReversedWords());
        }


        private static void ex5 () throws InterruptedException {
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

            while (true) {
                if (personQueue.isEmpty()) {
                    break;
                }
                else
                    System.out.println(personQueue.poll());

                // TODO...
                // Display contents of queue on console.
                // Remove first person from queue.
                // if queue is empty break from loop.

                TimeUnit.SECONDS.sleep(2);
            }

            System.out.println("Finished");
        }

        private static void ex6 () {
        ArrayList<Car> carList = new ArrayList<Car>();
        Car c1 = new Car("honda", "civic", 25000F,"blue",10000);
        Car c2 = new Car("Nissan", "Pathfinder", 52000F, "Blue", 30000);
        Car c3 = new Car("Porsche", "Panamera", 100000F, "White", 24);
        Car c4 = new Car("BMW", "5 series", 60000F, "White", 15);
        Car c5 = new Car("Mercedes", "E350", 65000F, "White", 35);


            System.out.println("TODO...");
            carList.add(c1);
            carList.add(c2);
            carList.add(c3);
            carList.add(c4);
            carList.add(c5);

             carList.sort(Car::compareTo);
            for (Car c: carList) {
                System.out.println(c);
            }

            Comparator<Car> priceComparator = new Comparator<Car>() {
                public int compare(Car c1, Car c2) {
                    return (int)c1.getPrice() - (int)c2.getPrice();
                }
            };
            carList.sort(priceComparator);
            for (Car c: carList) {
                System.out.println(c);
            }
        }

    }
