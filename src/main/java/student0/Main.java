package student0;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        ex3();
        //ex4();
        //ex5();
        //ex6();
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

        var set = new HashSet<Person>();
        set.add(p);
        set.add(p1);
        set.add(p2);

        System.out.println(set);



    }

    private static void ex4() {

    }

    private static void ex5() {

    }

    private static void ex6() {

    }

}
