package student17;

import java.util.HashSet;

public class PersonDeDuper extends Person{
    //
    //Data Member
    //
    private HashSet<Person> hashSet = new HashSet();
    //
    //Constructor
    //
    public PersonDeDuper() {
    }
    public void addPerson(Person p) {
       hashSet.add(p);
    }
    public String getUniquePeople() {
        String reval = "";
        for (Person p : hashSet) {
            reval += p + "\n";
        }
        return reval;
    }

}
