package student20;

public class Main {
    public static void main(String[] args) {
        //ex1();
        ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
    }

    private static void ex1() {
        var p = new Person("Alexis", "Maddison", 11, "123-45-1234");
        var p1 = new Person("Tala", "Domon", 22, "123-45-1234");
        var p2 = new Person("Solstice", "Salem", 22, "000-00-0000");

        if (p.equals(p1)) {
            System.out.printf("Yes");
        }
        if (p1.equals(p2)) {
            System.out.println("Here");
        }
    }

    private static void ex2() {
        var inputString = "I own two dogs and Four cats.";
        var wordCounter = new WordCounter(inputString);
        wordCounter.countWords();
        System.out.println(wordCounter.getWordCount());
    }

    private static void ex3() {
        System.out.println("TODO...");
    }

    private static void ex4() {
        System.out.println("TODO...");
    }

    private static void ex5() {
        System.out.println("TODO...");
    }

    private static void ex6() {
        System.out.println("TODO...");
    }
}