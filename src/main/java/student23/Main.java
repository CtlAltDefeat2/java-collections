package student23;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//         ex1();
        //ex2();
//        ex3();
//        ex4();
//        ex5();
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

        Queue<Person> queue = new LinkedList<>();

        queue.add(p1);
        queue.add(p2);
        queue.add(p3);
        queue.add(p4);
        queue.add(p5);
        queue.add(p6);

        while (true) {
            // Display contents of queue on console.
            System.out.println(queue.peek().getName() + " " + queue.peek().getAge());
            // Remove first person from queue.
            queue.poll();
            // if queue is empty break from loop.
            if(queue.isEmpty()){
                break;
            }
            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Finished");
    }

    private static void ex6() {
        var cars= new ArrayList<Car>();
        cars.add(new Car("Toyota", "Prius Prime", 34450, "white", 62 ));
        cars.add(new Car("Tesla", "Model 3 Long Range", 62990, "red", 123));
        cars.add(new Car("Hyundai", "Kona Electric Limited", 42500, "brown", 108));
        cars.add(new Car("Chevrolet", "Bolt 2LT", 34700, "black", 109));
        cars.add(new Car("Chevrolet", "Bolt EUV Premier", 38000, "grey", 105));

        Collections.sort(cars);

        for(Car item : cars){
            System.out.println(item.Make + " " + item.Model + " " + item.Price + " " + item.Color + " " + item.MilesPerGallon);
        }
        System.out.println("\n \n \n");
        Comparator<Car> priceComparator = new Comparator<Car>(){
            public int compare(Car car1, Car car2) {
                return (int) (car1.getPrice()- car2.getPrice());
            }
        };
        cars.sort(priceComparator);
        for(Car item : cars){
            System.out.println(item.Make + " " + item.Model + " " + item.Price + " " + item.Color + " " + item.MilesPerGallon);
        }
    }
}
