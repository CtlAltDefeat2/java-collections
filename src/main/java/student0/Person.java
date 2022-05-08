package student0;

import java.util.Objects;

public class Person {

    //
    // Data Members
    //

    private String firstName;
    private String lastName;
    private String ssn;
    private int age;

    //
    // Constructors
    //

    public Person() {}

    public Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    //
    // Overrides
    //

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        if (this.ssn.equals(person.ssn)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
