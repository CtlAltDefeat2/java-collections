package student13;

import java.util.Objects;

public class Person {
    // data members

    private String firstName;
    private String lastName;
    private int age;
    private String ssn;

    // constructors

    Person() {

    }

    Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName) && ssn.equals(person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, ssn);
    }
}
