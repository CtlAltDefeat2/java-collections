package student0;

import java.util.Objects;

public class Person {

    //
    // Data Members
    //

    private String firstName;
    private String lastName;
    private int age;

    //
    // Constructors
    //

    public Person() {}

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //
    // Overrides
    //

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
