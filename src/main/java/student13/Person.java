package student13;

import java.util.Objects;

public class Person {
    // data members

    private String firstName;
    private String lastName;
    private int age;
    private String ssn;

    // constructors

    Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, ssn);
    }

    @Override
    public String toString() {

//        return firstName + " " +
//                lastName + " " +
//                age + " " +
//                ssn;
        return firstName + " " + age;
    }
}
