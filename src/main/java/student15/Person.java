package student15;

import java.util.Objects;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private String ssn;

    // Constructor

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
        return Objects.equals(ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }
}


