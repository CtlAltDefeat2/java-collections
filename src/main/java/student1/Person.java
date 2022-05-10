package student1;

import java.util.Objects;

public class Person {

    //
    //Data members
    //

    private String firstName;
    private String lastName;
    private int age;
    private String socialSecurityNumber;

    //
    //Constructors
    //

    public Person(String firstName, String lastName, int age, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //
    //Methods
    //
// equal and hash generator
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return socialSecurityNumber.equals(person.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialSecurityNumber);
    }
}


