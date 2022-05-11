package student15;

import java.util.HashSet;
import java.util.Stack;

public class PersonDeDuper {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;

    HashSet<Person> personDeDuper = new HashSet<Person>();
    public PersonDeDuper(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

      public PersonDeDuper() {}

    public String getUniquePeople() {
        String a = "";
        return a;

       }

    public void addPerson(Person person) {
     personDeDuper.add(person);


    }
}

