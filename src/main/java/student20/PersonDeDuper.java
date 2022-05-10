package student20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class PersonDeDuper {

    HashSet<Person> people = new HashSet<Person>();

    PersonDeDuper() {
    }


    public void addPerson(Person person) {
        people.add(person);

    }

    public String getUniquePeople() {
        String value = "";
        for (Person i : people) {
            value += i.fName + " " + i.lName + " " + i.age + " " + i.SSN + "\n";
        }
        return value;
    }
}