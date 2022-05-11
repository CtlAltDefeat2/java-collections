package student5;

import java.util.HashSet;

public class PersonDeDuper extends Person {
    // Variable Declarations
    private HashSet<Person> personSet = new HashSet<>();
    // Constructors
    public PersonDeDuper () {}
    // Methods
    public void addPerson(Person person) {
        personSet.add(person);
    }
    public String getUniquePeople() {
        String returnValue = "";
        for (Person person : personSet) {
            returnValue += person.getFirstName() + " " + person.getLastName() + ", " + person.getAge() + ", " + person.getSsn() + "\n";
        }
        return returnValue;
    }
}