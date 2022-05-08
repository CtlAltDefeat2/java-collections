package Data;

import java.util.ArrayList;

public class DataAccess {

    public static ArrayList<Cat> getCats() {
        ArrayList<Cat> retval = new ArrayList<Cat>();
        retval.add(new Cat("Binky", "Gray"));
        retval.add(new Cat("Lily", "Brown"));
        retval.add(new Cat("Gypsy", "Black"));
        retval.add(new Cat("Rocky", "White"));
        retval.add(new Cat("Gabby", "Brown"));
        return retval;
    }

    public static ArrayList<Guitar> getGuitars() {
        ArrayList<Guitar> retval = new ArrayList<Guitar>();
        retval.add(new Guitar("Modern", "Suhr", 4000.00F));
        retval.add(new Guitar("Strat", "Fender", 1000.00F));
        retval.add(new Guitar("Tele", "Fender", 1200.00F));
        retval.add(new Guitar("Bolt", "Carvin", 1000.00F));
        return retval;
    }

    public static ArrayList<Student> getStudents() {
        ArrayList<Student> retval = new ArrayList<Student>();
        retval.add(new Student("Alice", "111-11-1111"));
        retval.add(new Student("Bob", "222-22-2222"));
        retval.add(new Student("Charlie", "333-33-3333"));
        retval.add(new Student("Dave", "444-44-4444"));
        return retval;
    }
}
