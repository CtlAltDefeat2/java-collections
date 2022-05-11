package student12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Person {
    //
    //Data Members
    //
    public String firstName;
    private String lastName;
    private int age;
    private String ssn;
    public ArrayList<Person> people = new ArrayList();
    public Queue<Person> personQueue = new LinkedList<Person>();

    //
    //Constructors
    //
    Person(){
    }

    Person(String firstName, int age){
        this.firstName = firstName;
        this.age = age;
    }

    Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }
    //
    //Methods
    //


    //
    //Accessors
    //


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }


    //
    //Overrides
    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ssn == person.ssn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, ssn);
    }

    @Override
    public String toString() {
        if (lastName == null){
            return firstName + " " + age;
        }
        else {
            return  firstName + " " + lastName + ", " + age + ", " +
                    ssn + "\n";
        }


    }

}
