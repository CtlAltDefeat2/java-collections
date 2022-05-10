package student13;

import java.util.HashSet;

public class PersonDeDuper {
    // Data Members

    private HashSet<Person> people;

    // Constructors

    PersonDeDuper() {
        this.people = new HashSet<>();
    }

    // Methods

    public void addPerson(Person person) {
        people.add(person);
    }

    public String getUniquePeople() {
        String retVal = "";
//        String[] arrHash = people.toArray(new String[people.size()]);

//        for (int i = 0; i < arrHash.length; i++) {
//            retVal += arrHash[i];
//        }
        for (Person id : people) {
            retVal += id.getFirstName() + " " + id.getLastName() + ", " +
                    id.getAge() + ", " + id.getSsn() + "\n";
        }

        return retVal;
    }
}
