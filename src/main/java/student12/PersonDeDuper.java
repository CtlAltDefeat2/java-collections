package student12;

import java.util.*;

public class PersonDeDuper extends Person{
    //
    //Data Members
    //
    public HashSet<Person> personSet = new HashSet<>();

    //
    //Constructors
    //
    PersonDeDuper(){
    }

    //
    //Accessors
    //
    public String getUniquePeople(){
        uniquePeople(people);
        var retval = "";
        for (Person person: personSet){
            //retval += person.getFirstName() + " " + person.getLastName() + ", " + person.getSsn() + "\n";
            retval += person + "\n";
        }
        return retval;
    }

    //
    //Methods
    //
    public void addPerson(Person person){
        this.people.add(person);
    }

    private void uniquePeople (ArrayList<Person> people){
        for (Person p : people){
            this.personSet.add(p);
        }
    }

    //
    //Overrides
    //



}
