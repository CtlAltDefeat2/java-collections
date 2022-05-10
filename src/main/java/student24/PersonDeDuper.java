package student24;

import java.util.HashSet;



public class PersonDeDuper {
    HashSet<Person> person = new HashSet<>();

    public PersonDeDuper() {
    }

    public void addPerson(Person p) {
        person.add(p);
    }


    public String getUniquePeople() {
        String personValue="";
        for(Person p : person){
            personValue +=p +"\n";
        }
        return personValue ;
    }
}
