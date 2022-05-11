package student9;

import java.util.HashSet;

public class PersonDeDuper {
    // Create data members.
    private final HashSet<Person> uniquePeople;

    // Generate constructor.
    public PersonDeDuper() {
        this.uniquePeople = new HashSet<>(); // Auto compares the value.
    }

    // Create methods.
    public String getUniquePeople() { // Prints out all unique people.
        String stringValue = " ";
        for (Person i : uniquePeople) {
            stringValue += i + "\n";
        }
        return stringValue;
    }

    public void addPerson(Person i) { // Add to HashSet.
        uniquePeople.add(i);
    }
}
