package student26;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class PersonDeDuper {

    //Data
    private final HashSet<Person> uniquePeople;

    public PersonDeDuper() {

        this.uniquePeople = new HashSet<Person>();
    }

    public void addPerson(Person person){

        uniquePeople.add(person);
    }
    public String getUniquePeople() {
        String retVal = "";
        for (Person p : uniquePeople) {
            retVal += p.getName() + " " + p.getLastname() + " " + p.getAge() + " " + p.getSSN() + "\n";
        }
        return retVal ;
    }
}
