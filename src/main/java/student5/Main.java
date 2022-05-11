package student5;

import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();
        //ex6();
    }
    private static void ex1() {
        var p = new Person("Tom", "Thumb", 11, "123-45-1234");
        var p1 = new Person("Jon", "Smith", 22, "123-45-1234");
        var p2 = new Person("Jon", "Smith", 22, "000-00-0000");

        if (p.equals(p1)) {
            System.out.println("Yes");
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
        var p5 = new Person("Edgar", 55);
        var p6 = new Person("Fred", 66);
        var isNotEmpty = true;

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add(p1.toString());
        queue.add(p2.toString());
        queue.add(p3.toString());
        queue.add(p4.toString());
        queue.add(p5.toString());
        queue.add(p6.toString());

        while (isNotEmpty) {
            // TODO...
            System.out.println(queue);
            queue.remove();
            if (queue.isEmpty()) {
                isNotEmpty = false;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("Finished");
    }
    private static void ex6() {
        System.out.println("TODO...");
    }
}