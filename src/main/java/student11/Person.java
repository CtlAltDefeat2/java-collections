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
    public boolean equals(Object o) {//compare member of two objects of the same class
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return ssn.equals(person.ssn);
    }

    @Override
    public int hashCode() {//detect if two object in a hashset and get rid of any duplicate
        return Objects.hash(ssn);
    }

    @Override
    public String toString() {
        return
                name + '\'' +
                lastName + '\'' +
                age +
                ssn + '\'';
    }
}
