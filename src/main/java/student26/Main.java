package student26;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

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

        var wordReverser= new WordReverser("This is a test");
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


        Queue<Person> personque = new LinkedList<Person>();
        personque.add(p1);
        personque.add(p2);
        personque.add(p3);
        personque.add(p4);
        personque.add(p5);
        personque.add(p6);

        while(true) {
            System.out.println(personque);
            personque.remove();

            if (personque.isEmpty()){
                break;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("Finished");


    }

    private static void ex6() {

        var c1 = new Car("Nissan","Altima",18000,"green",5000);
        var c2= new Car ("Honda","Odyssey",15000,"blue",2500);
        var c3= new Car ("Kia","Sol",25000, "red",3000);
        var c4 = new Car ("Acura", "ILX",20000,"yellow",5000);
        var c5 = new Car ("Hyundai", "Elantra", 22000,"Silver", 6000);
        //list
        ArrayList <Car> car= new ArrayList<>();
        car.add(c1);
        car.add(c2);
        car.add(c3);
        car.add(c4);
        car.add(c5);

        // Collections.sort(car);

        Comparator<Car> priceComparator= new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getPrice() -c2.getPrice();
            }
        };
        car.sort(priceComparator);

        for (Car c : car) {
            System.out.println(c);
        }

    }


}

