package student0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PersonDeDuper {

    //
    // Data members
    //

    private HashSet<Person> personHashSet;

    //
    // Constructors
    //

    PersonDeDuper() {
        personHashSet = new HashSet<Person>();
    }

    //
    // Methods
    //

    public void addPerson(Person p) {
        personHashSet.add(p);
    }

    public String getUniquePeople() {
        var retval = "";
        var unquiePeople = personHashSet.stream().toList();
        for (Person p : unquiePeople) {
            retval += (p.toString() + "\n");
        }
        return retval;
    }
}
