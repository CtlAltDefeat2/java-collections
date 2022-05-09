package student9;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
    }

    public Main() {
    }

    private static void ex1() {

        var list = new ArrayList<Person>(); // p, p1, p2.

        var personMap = new HashMap<String, Integer>();

        var p = new Person("Tom", "Thumb", 11, "123-45-1234");
        var p1 = new Person("Jon", "Smith", 22, "123-45-1234");
        var p2 = new Person("Jon", "Smith", 22, "000-00-0000");

        if (p.equals(p1)) {
            System.out.printf("Yes");
        }
        if (p1.equals(p2)) {
            System.out.println("Here");
        }
     /*   Output:
```
        Yes
```

        //The `Person`class overrides the equals method.
            //System.out.println("TODO...");*/
    }
    /*Ex. 1 Equals

    Create a `Person` class that can be consumed in the following manner:

    ```java */

    private static void ex2() {
        System.out.println("TODO...");
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
