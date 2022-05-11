package student24;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, String ssn) {
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
        return ssn.equals(person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, ssn);
    }

    @Override
    public String toString() {
        return firstName + " "  + age  ;
    }
}
