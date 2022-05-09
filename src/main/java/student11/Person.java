package student11;

import java.util.Objects;

public class Person {
    //
    //Data Members
    //
    private String name;
    private String lastName;
    private int age;
    private String ssn;

    //
    //Constructors
    //
    public Person(String name, String lastName, int age, String ssn) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return ssn.equals(person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }
}
