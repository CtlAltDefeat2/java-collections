package student2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class PersonDeDuper {
    private String firstName, lastName, ssn;
    private int age;
    HashSet<Person> set= new HashSet<>();

    List<Person> list1= new ArrayList<>();

    public PersonDeDuper(){
    }

    public void addPerson(Person person) {
        this.set.add(person);

    }

    public Object getUniquePeople() {
        String personString="";
        for (Person p:set  ) {
            personString+=p+"\n";

        }
        return personString;
    }
}
