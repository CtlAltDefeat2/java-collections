package student12;

import java.util.Objects;

public class Person {
    //
    //Data Members
    //
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;

    //
    //Constructors
    //
    Person(){
    }

    Person(String firstName, String lastName, int age, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    //
    //Overrides
    //


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
}
