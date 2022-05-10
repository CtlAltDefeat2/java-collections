package student23;

import java.util.HashSet;

public class PersonDeDuper {
    HashSet<Person> hashset = new HashSet<>();
    public void addPerson(Person p) {
        hashset.add(p);
    }

    public String getUniquePeople() {
        String output = "";
        for(Person p : hashset){
            output += p.FirstName + " " + p.LastName + ", " + p.age + " " + p.ssn + "\n";
        }
        return output;
    }
}
