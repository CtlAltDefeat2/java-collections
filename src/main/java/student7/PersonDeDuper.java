package student7;

import java.util.HashSet;

public class PersonDeDuper {
    private HashSet<Person> people = new HashSet<>();
    public PersonDeDuper() {
    }
    public void addPerson(Person p){
        people.add(p);
    }
    public String getUniquePeople(){
        String retVal = "";
        for(Person p : people){
            retVal += p + "\n";
        }
        return retVal;
    }
}
