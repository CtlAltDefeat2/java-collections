package student5;

import java.util.Objects;

public class Person {
    // Variable Declarations
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    // Constructors
    public Person () {}
    public Person (String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }
    public Person (String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }
    // Accessors
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getSsn() {
        return ssn;
    }
    // Overrides
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
        if (lastName != null || ssn != null) {
            return firstName + " " + lastName + ", " + age + ", " + ssn;
        } else return firstName + " " + age;
    }
}