package student21;
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

//    private static void ex1() {
//
//        var p = new Person("Tom", "Thumb", 11, "123-45-1234");
//        var p1 = new Person("Jon", "Smith", 22, "123-45-1234");
//        var p2 = new Person("Jon", "Smith", 22, "000-00-0000");
//
//        if (p.equals(p1)) {
//            System.out.printf("Yes");
//        }
//        if (p1.equals(p2)) {
//            System.out.println("Here");
//        }
//
//    }

    private static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        var inputString = scanner.nextLine();
        var wordCounter = new WordCounter(inputString);


    }

//    private static void ex3() {
//        var p = new Person("Alice", "Jones", 11, "111-11-1111");
//        var p1 = new Person("Alice", "Jones", 11, "111-11-1111");
//        var p2 = new Person("Bob", "Smith", 22, "222-22-2222");
//        var p3 = new Person("Bob", "Smith", 22, "222-22-2222");
//
//        var personDeDuper = new PersonDeDuper();
//        personDeDuper.addPerson(p);
//        personDeDuper.addPerson(p1);
//        personDeDuper.addPerson(p2);
//        personDeDuper.addPerson(p3);
//
//        System.out.println(personDeDuper.getUniquePeople());
//    }

    private static void ex4() {
        var wordReverser = new WordReverser("This is a test");
        wordReverser.reverseWords();
        System.out.println(wordReverser.getReversedWords());
    }

    private static void ex5() throws InterruptedException {
        var p1 = new Person("Alice", 11);
        var p2 = new Person("Bob", 22);
        var p3 = new Person("Charlie", 33);
        var p4 = new Person("Dave", 44);
        var p5 = new Person("Egar", 55);
        var p6 = new Person("Fred", 66);

//        Create queue ALWAYS MAKE THEM THIS WAY
        Queue<Person> queue = new LinkedList<Person>();
        queue.add(p1);
        queue.add(p2);
        queue.add(p3);
        queue.add(p4);
        queue.add(p5);
        queue.add(p6);



        while (!queue.isEmpty()) {
            // TODO...
            // Display contents of queue on console.
            System.out.println(queue);
            // Remove first person from queue.
            queue.poll();
            //Creates a pause in the action so that it is performed slowly
            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Finished");
    }

    private static void ex6() {
        //Making array list for cars
        ArrayList<Car> carList = new ArrayList<Car>();

        //making cars (make, model, price, color, mileage) and adding them to the array list
        carList.add(new Car("Bugatti","Chiron",4000000.00f,"Red",10000.00f));
        carList.add(new Car("Acura","ILX",20000.00f,"White",30000.00f));
        carList.add(new Car("Acura","TLX",30000.00f,"Blue",30000.00f));
        carList.add(new Car("GMC","Sierra",45000.00f,"Black",2000.00f));
        carList.add(new Car("Ford","Mustang",80000.00f,"Grey",75000.00f));
        carList.add(new Car("Chevrolet","Camaro",60000.00f,"Yellow",100000.00f));

        Collections.sort(carList);
        System.out.println(carList);

        Comparator<Car> carComparator = new Comparator<Car>() {
            public int compare(Car c1, Car c2) {
                return (int) (c1.getPrice()-c2.getPrice());
            }
        };
        carList.sort(carComparator);
        System.out.println(carList);
    }
}

