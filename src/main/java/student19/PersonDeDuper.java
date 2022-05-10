package student19;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
public class PersonDeDuper {
    private HashSet<Person> hs = new HashSet<>();
    public PersonDeDuper() {
    }
    public void addPerson(Person p1) {
        hs.add(p1);
    }
    public String getUniquePeople() {
    String retval = " ";
    for(Person p1: hs){
        retval += p1 + "\n";
    }
        return retval;
    }
}
