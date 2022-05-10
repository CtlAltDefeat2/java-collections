package student25;

public class Main { // Wendy
    public static void main(String[] args) {
       // ex1();
      //  ex2();
      //  ex3();
        ex4();
        //ex5();
        //ex6();
    }

    private static void ex1() {
       // Create a Person class that can be consumed in the following manner:
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
       // Create a class called WordCounter that can be consumed in this manner:

        var inputString = "The water main broke on water street on the day before my birthday";
        var wordCounter = new WordCounter(inputString);
        wordCounter.countWords();
        System.out.println(wordCounter.getWordCount());
    }

    private static void ex3() {
       // Create a class called PersonDeDuper that can be consumed in the following manner:

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

       // Create a class called WordReverser that can be consumed in the following manner:

        var wordReverser = new WordReverser("This is a test");
        wordReverser.reverseWords();
        System.out.println(wordReverser.getReversedWords());
        System.out.println(wordReverser.getWordCount());
    }

    private static void ex5() {
        System.out.println("TODO...");
    }

    private static void ex6() {
        System.out.println("TODO...");
    }
}

