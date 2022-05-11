package student15;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String ssn;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
          }
    Queue<Person> personQueue= new LinkedList<Person>();

    // Constructor

    public Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{ "+
                "age" + age +
                ",name ='" + firstName + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }
}


